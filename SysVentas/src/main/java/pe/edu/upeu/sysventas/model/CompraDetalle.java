package pe.edu.upeu.sysventas.model;


public class CompraDetalle {
    private Long idCompraDetalle;
    private Double pu;
    private Double cantidad;
    private Double subtotal;
    private Compra idCompra;
    private Producto idProducto;

    public CompraDetalle() {}
    public CompraDetalle(Long idCompraDetalle, Double pu, Double cantidad, Double subtotal, Compra idCompra, Producto idProducto) {
        this.idCompraDetalle = idCompraDetalle;
        this.pu = pu;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
    }
    public Long getIdCompraDetalle() { return idCompraDetalle; }
    public void setIdCompraDetalle(Long idCompraDetalle) { this.idCompraDetalle = idCompraDetalle; }
    public Double getPu() { return pu; }
    public void setPu(Double pu) { this.pu = pu; }
    public Double getCantidad() { return cantidad; }
    public void setCantidad(Double cantidad) { this.cantidad = cantidad; }
    public Double getSubtotal() { return subtotal; }
    public void setSubtotal(Double subtotal) { this.subtotal = subtotal; }
    public Compra getIdCompra() { return idCompra; }
    public void setIdCompra(Compra idCompra) { this.idCompra = idCompra; }
    public Producto getIdProducto() { return idProducto; }
    public void setIdProducto(Producto idProducto) { this.idProducto = idProducto; }
}
