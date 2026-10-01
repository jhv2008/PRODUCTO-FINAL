package pe.edu.upeu.sysventas.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import pe.edu.upeu.sysventas.config.AppContext;
import java.io.IOException;

public class MainguiController {
    @FXML private TabPane tabPane;
    private ProductoController productos;
    @FXML public void initialize() { abrirProductos(); }
    @FXML public void abrirProductos() {
        if (productos != null) { productos.filtrarMarca("Todas"); return; }
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/main_producto.fxml"));
            loader.setControllerFactory(AppContext.getInstance()::getBean);
            Parent vista = loader.load();
            productos = loader.getController();
            ScrollPane scroll = new ScrollPane(vista);
            scroll.getStyleClass().add("fondo-transparente");
            scroll.setFitToWidth(true); scroll.setFitToHeight(true);
            tabPane.getTabs().setAll(new Tab("Administrar zapatillas", scroll));
        } catch (IOException ex) { throw new RuntimeException("No se pudo abrir el formulario de zapatillas.", ex); }
    }
    @FXML private void nike() { productos.filtrarMarca("Nike"); }
    @FXML private void adidas() { productos.filtrarMarca("Adidas"); }
    @FXML private void jordan() { productos.filtrarMarca("Jordan"); }
    @FXML private void puma() { productos.filtrarMarca("Puma"); }
    @FXML private void newAtletic() { productos.filtrarMarca("New Atletic"); }
    @FXML private void nuevo() { productos.clearForm(); }
    @FXML private void ayuda() {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION,
            "Selecciona una marca desde el menú.\nUsa Buscar para filtrar por modelo o talla.\n"
            + "Elige Mujer (34 a 40) u Hombre (38 a 43), luego la talla.\nCompleta el formulario y pulsa Guardar.\nLos iconos de la tabla permiten editar o eliminar.\n\n"
            + "Datos y precios de ejemplo. Los cambios se pierden al cerrar.");
        alerta.setHeaderText("Tienda de zapatillas - Jhon"); alerta.showAndWait();
    }
    public boolean confirmarSalida() {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION,
            "¿Salir? Los cambios de esta sesión no se conservarán.", ButtonType.YES, ButtonType.NO);
        alerta.setHeaderText("Cerrar tienda");
        return alerta.showAndWait().orElse(ButtonType.NO) == ButtonType.YES;
    }
    @FXML private void salir() { if (confirmarSalida()) Platform.exit(); }
}
