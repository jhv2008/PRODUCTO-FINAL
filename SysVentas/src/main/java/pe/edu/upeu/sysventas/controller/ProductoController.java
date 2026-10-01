package pe.edu.upeu.sysventas.controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import pe.edu.upeu.sysventas.components.ColumnInfo;
import pe.edu.upeu.sysventas.components.TableViewHelper;
import pe.edu.upeu.sysventas.dto.ComboBoxOption;
import pe.edu.upeu.sysventas.enums.TipoProducto;
import pe.edu.upeu.sysventas.model.Producto;
import pe.edu.upeu.sysventas.service.*;
import java.util.LinkedHashMap;
import java.util.Locale;

public class ProductoController {
    private final IMarcaService ms;
    private final ICategoriaService cs;
    private final IProductoService ps;
    private final IUnidadMedidaService us;
    @FXML private ComboBox<ComboBoxOption> cbxTipoProducto, cbxMarca, cbxCategoria, cbxUnidMedida;
    @FXML private TextField txtNombreProducto, txtPUnit, txtPUnitOld, txtUtilidad, txtStock, txtStockOld, txtFiltroDato;
    @FXML private ComboBox<String> cbxGenero;
    @FXML private ComboBox<Integer> cbxTalla;
    @FXML private TableView<Producto> tableView;
    @FXML private Label lbnMsg;
    private Long idProductoCE = 0L;
    private String marcaFiltro = "Todas";

    public ProductoController(IMarcaService ms, ICategoriaService cs, IProductoService ps, IUnidadMedidaService us) {
        this.ms = ms; this.cs = cs; this.ps = ps; this.us = us;
    }
    @FXML public void initialize() {
        cbxTipoProducto.setItems(FXCollections.observableArrayList(ps.listarTipoProducto()));
        cbxMarca.setItems(FXCollections.observableArrayList(ms.listarCombobox()));
        cbxCategoria.setItems(FXCollections.observableArrayList(cs.listarCombobox()));
        cbxUnidMedida.setItems(FXCollections.observableArrayList(us.listarCombobox()));
        cbxGenero.getItems().setAll("Hombre", "Mujer");
        cbxGenero.valueProperty().addListener((obs, anterior, actual) -> cargarTallas());
        LinkedHashMap<String, ColumnInfo> columnas = new LinkedHashMap<>();
        columnas.put("ID", new ColumnInfo("idProducto", 45.0));
        columnas.put("Modelo", new ColumnInfo("nombre", 155.0));
        columnas.put("Público", new ColumnInfo("genero", 75.0));
        columnas.put("Talla", new ColumnInfo("talla", 55.0));
        columnas.put("Precio S/", new ColumnInfo("pu", 85.0));
        columnas.put("Stock", new ColumnInfo("stock", 60.0));
        columnas.put("Marca", new ColumnInfo("idMarca.nombre", 105.0));
        columnas.put("Categoría", new ColumnInfo("idCategoria.nombre", 90.0));
        tableView.getColumns().clear();
        new TableViewHelper<Producto>().addColumnsInOrderWithSize(tableView, columnas, this::editForm, this::eliminar);
        tableView.setPlaceholder(new Label("No se encontraron zapatillas."));
        txtFiltroDato.textProperty().addListener((obs, antes, ahora) -> listar());
        marcaFiltro = "Todas";
        clearForm(); listar();
    }
    public void filtrarMarca(String marca) {
        marcaFiltro = marca;
        txtFiltroDato.clear();
        listar();
        lbnMsg.setText("Marca seleccionada: " + marca);
    }
    @FXML public void listar() {
        var resultado = FXCollections.<Producto>observableArrayList();
        String filtro = txtFiltroDato.getText().trim().toLowerCase(Locale.ROOT);
        for (Producto p : ps.findAll()) {
            boolean marca = marcaFiltro.equals("Todas") || p.getIdMarca().getNombre().equals(marcaFiltro);
            String texto = (p.getNombre() + " " + p.getIdMarca().getNombre() + " " + p.getGenero() + " " + p.getTalla()).toLowerCase(Locale.ROOT);
            if (marca && texto.contains(filtro)) resultado.add(p);
        }
        tableView.setItems(resultado);
    }
    @FXML public void onGuardar() {
        try {
            if (txtNombreProducto.getText().trim().isEmpty()) throw new IllegalArgumentException("Escribe el nombre del modelo.");
            if (cbxMarca.getValue() == null || cbxCategoria.getValue() == null || cbxUnidMedida.getValue() == null)
                throw new IllegalArgumentException("Selecciona marca, categoría y unidad.");
            if (cbxGenero.getValue() == null || cbxTalla.getValue() == null)
                throw new IllegalArgumentException("Selecciona el público y una talla.");
            int talla = cbxTalla.getValue();
            boolean mujer = "Mujer".equals(cbxGenero.getValue());
            if (talla < (mujer ? 34 : 38) || talla > (mujer ? 40 : 43))
                throw new IllegalArgumentException("La talla no corresponde al público seleccionado.");
            Producto p = new Producto();
            p.setGenero(cbxGenero.getValue());
            p.setTalla(talla);
            p.setNombre(txtNombreProducto.getText().trim());
            p.setTipoProducto(TipoProducto.PRODUCTO);
            p.setPu(numero(txtPUnit, "Precio", true, false));
            p.setPuold(numero(txtPUnitOld, "Precio anterior", false, false));
            p.setUtilidad(numero(txtUtilidad, "Utilidad", false, false));
            p.setStock(numero(txtStock, "Stock", false, true));
            p.setStockold(numero(txtStockOld, "Stock anterior", false, true));
            p.setIdMarca(ms.findById(Long.parseLong(cbxMarca.getValue().getKey())));
            p.setIdCategoria(cs.findById(Long.parseLong(cbxCategoria.getValue().getKey())));
            p.setIdUnidad(us.findById(Long.parseLong(cbxUnidMedida.getValue().getKey())));
            boolean editar = idProductoCE != 0L;
            if (editar) { p.setIdProducto(idProductoCE); ps.update(idProductoCE, p); }
            else ps.save(p);
            clearForm();
            marcaFiltro = "Todas"; txtFiltroDato.clear(); listar();
            lbnMsg.setText(editar ? "Zapatilla actualizada correctamente." : "Zapatilla registrada correctamente.");
        } catch (IllegalArgumentException ex) {
            lbnMsg.setText(ex.getMessage());
        }
    }
    private double numero(TextField campo, String nombre, boolean positivo, boolean entero) {
        double valor;
        try { valor = Double.parseDouble(campo.getText().trim().replace(',', '.')); }
        catch (NumberFormatException ex) { throw new IllegalArgumentException(nombre + ": escribe un número válido."); }
        if (!Double.isFinite(valor) || valor < 0 || (positivo && valor == 0) || (entero && valor != Math.floor(valor)))
            throw new IllegalArgumentException(nombre + ": " + (entero ? "usa un entero desde 0." : positivo ? "debe ser mayor que 0." : "no puede ser negativo."));
        return valor;
    }
    public void editForm(Producto p) {
        idProductoCE = p.getIdProducto();
        txtNombreProducto.setText(p.getNombre());
        cbxGenero.setValue(p.getGenero());
        cbxTalla.setValue(p.getTalla());
        txtPUnit.setText(p.getPu().toString()); txtPUnitOld.setText(p.getPuold().toString());
        txtUtilidad.setText(p.getUtilidad().toString());
        txtStock.setText(p.getStock().toString()); txtStockOld.setText(p.getStockold().toString());
        seleccionar(cbxMarca, p.getIdMarca().getIdMarca());
        seleccionar(cbxCategoria, p.getIdCategoria().getIdCategoria());
        seleccionar(cbxUnidMedida, p.getIdUnidad().getIdUnidad());
        lbnMsg.setText("Editando registro " + idProductoCE + ". Pulsa Guardar para actualizar.");
    }
    private void seleccionar(ComboBox<ComboBoxOption> combo, Long id) {
        for (ComboBoxOption opcion : combo.getItems()) {
            if (opcion.getKey().equals(id.toString())) { combo.setValue(opcion); return; }
        }
    }
    private void eliminar(Producto p) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION, "¿Eliminar " + p.getNombre() + "?", ButtonType.YES, ButtonType.NO);
        alerta.setHeaderText("Eliminar zapatilla");
        alerta.initOwner(tableView.getScene().getWindow());
        if (alerta.showAndWait().orElse(ButtonType.NO) == ButtonType.YES) {
            ps.delete(p.getIdProducto());
            if (idProductoCE.equals(p.getIdProducto())) clearForm();
            listar(); lbnMsg.setText("Zapatilla eliminada.");
        }
    }
    private void cargarTallas() {
        cbxTalla.getItems().clear();
        boolean mujer = "Mujer".equals(cbxGenero.getValue());
        int primera = mujer ? 34 : 38;
        int ultima = mujer ? 40 : 43;
        for (int talla = primera; talla <= ultima; talla++) cbxTalla.getItems().add(talla);
        cbxTalla.getSelectionModel().selectFirst();
    }
    @FXML public void clearForm() {
        idProductoCE = 0L; txtNombreProducto.clear(); txtPUnit.clear();
        cbxGenero.setValue("Hombre"); cargarTallas();
        txtPUnitOld.setText("0"); txtUtilidad.setText("0"); txtStock.setText("0"); txtStockOld.setText("0");
        cbxTipoProducto.getSelectionModel().selectFirst();
        cbxMarca.getSelectionModel().clearSelection();
        cbxCategoria.getSelectionModel().selectFirst(); cbxUnidMedida.getSelectionModel().selectFirst();
        lbnMsg.setText("Nuevo registro. Elige Mujer (34–40) u Hombre (38–43).");
    }
}
