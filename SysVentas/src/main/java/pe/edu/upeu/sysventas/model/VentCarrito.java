package pe.edu.upeu.sysventas.model;


public class VentCarrito {

    private Long idCarrito;
    private String dniruc;
    private Producto idProducto;
    private String nombreProducto;
    private Double cantidad;
    private Double punitario;
    private Double ptotal;
    private int estado;
    private Usuario idUsuario;

    public VentCarrito() {}
    public VentCarrito(Long idCarrito, String dniruc, Producto idProducto, String nombreProducto, Double cantidad, Double punitario, Double ptotal, int estado, Usuario idUsuario) {
        this.idCarrito = idCarrito;
        this.dniruc = dniruc;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.punitario = punitario;
        this.ptotal = ptotal;
        this.estado = estado;
        this.idUsuario = idUsuario;
    }
    public Long getIdCarrito() { return idCarrito; }
    public void setIdCarrito(Long idCarrito) { this.idCarrito = idCarrito; }
    public String getDniruc() { return dniruc; }
    public void setDniruc(String dniruc) { this.dniruc = dniruc; }
    public Producto getIdProducto() { return idProducto; }
    public void setIdProducto(Producto idProducto) { this.idProducto = idProducto; }
    public String getNombreProducto() { return nombreProducto; }
    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }
    public Double getCantidad() { return cantidad; }
    public void setCantidad(Double cantidad) { this.cantidad = cantidad; }
    public Double getPunitario() { return punitario; }
    public void setPunitario(Double punitario) { this.punitario = punitario; }
    public Double getPtotal() { return ptotal; }
    public void setPtotal(Double ptotal) { this.ptotal = ptotal; }
    public int getEstado() { return estado; }
    public void setEstado(int estado) { this.estado = estado; }
    public Usuario getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Usuario idUsuario) { this.idUsuario = idUsuario; }
}
