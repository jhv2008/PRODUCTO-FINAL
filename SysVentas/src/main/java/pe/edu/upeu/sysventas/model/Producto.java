package pe.edu.upeu.sysventas.model;

import pe.edu.upeu.sysventas.enums.TipoProducto;

public class Producto {

    private Long idProducto;

    private String nombre;
    private String genero;
    private Integer talla;

    private TipoProducto tipoProducto;


    private Double pu;


    private Double puold;


    private Double utilidad;


    private Double stock;


    private Double stockold;

    private Categoria idCategoria;

    private Marca idMarca;

    private UnidMedida idUnidad;

    public Producto() {}
    public Producto(Long idProducto, String nombre, TipoProducto tipoProducto, Double pu, Double puold, Double utilidad, Double stock, Double stockold, Categoria idCategoria, Marca idMarca, UnidMedida idUnidad, String genero, Integer talla) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.pu = pu;
        this.puold = puold;
        this.utilidad = utilidad;
        this.stock = stock;
        this.stockold = stockold;
        this.idCategoria = idCategoria;
        this.idMarca = idMarca;
        this.idUnidad = idUnidad;
        this.genero = genero;
        this.talla = talla;
    }
    public Long getIdProducto() { return idProducto; }
    public void setIdProducto(Long idProducto) { this.idProducto = idProducto; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public Integer getTalla() { return talla; }
    public void setTalla(Integer talla) { this.talla = talla; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public TipoProducto getTipoProducto() { return tipoProducto; }
    public void setTipoProducto(TipoProducto tipoProducto) { this.tipoProducto = tipoProducto; }
    public Double getPu() { return pu; }
    public void setPu(Double pu) { this.pu = pu; }
    public Double getPuold() { return puold; }
    public void setPuold(Double puold) { this.puold = puold; }
    public Double getUtilidad() { return utilidad; }
    public void setUtilidad(Double utilidad) { this.utilidad = utilidad; }
    public Double getStock() { return stock; }
    public void setStock(Double stock) { this.stock = stock; }
    public Double getStockold() { return stockold; }
    public void setStockold(Double stockold) { this.stockold = stockold; }
    public Categoria getIdCategoria() { return idCategoria; }
    public void setIdCategoria(Categoria idCategoria) { this.idCategoria = idCategoria; }
    public Marca getIdMarca() { return idMarca; }
    public void setIdMarca(Marca idMarca) { this.idMarca = idMarca; }
    public UnidMedida getIdUnidad() { return idUnidad; }
    public void setIdUnidad(UnidMedida idUnidad) { this.idUnidad = idUnidad; }
}
