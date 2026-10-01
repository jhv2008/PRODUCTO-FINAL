package pe.edu.upeu.sysventas.model;


public class VentaDetalle {
    private Long idVentaDetalle;
    private Double pu;
    private Double cantidad;
    private Double descuento;
    private Double subtotal;
    private Venta idVenta;
    private Producto idProducto;

    public VentaDetalle() {}
    public VentaDetalle(Long idVentaDetalle, Double pu, Double cantidad, Double descuento, Double subtotal, Venta idVenta, Producto idProducto) {
        this.idVentaDetalle = idVentaDetalle;
        this.pu = pu;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.subtotal = subtotal;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
    }
    public Long getIdVentaDetalle() { return idVentaDetalle; }
    public void setIdVentaDetalle(Long idVentaDetalle) { this.idVentaDetalle = idVentaDetalle; }
    public Double getPu() { return pu; }
    public void setPu(Double pu) { this.pu = pu; }
    public Double getCantidad() { return cantidad; }
    public void setCantidad(Double cantidad) { this.cantidad = cantidad; }
    public Double getDescuento() { return descuento; }
    public void setDescuento(Double descuento) { this.descuento = descuento; }
    public Double getSubtotal() { return subtotal; }
    public void setSubtotal(Double subtotal) { this.subtotal = subtotal; }
    public Venta getIdVenta() { return idVenta; }
    public void setIdVenta(Venta idVenta) { this.idVenta = idVenta; }
    public Producto getIdProducto() { return idProducto; }
    public void setIdProducto(Producto idProducto) { this.idProducto = idProducto; }
}
