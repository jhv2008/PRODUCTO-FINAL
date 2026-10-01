package pe.edu.upeu.sysventas.model;

import java.time.LocalDateTime;
import java.util.List;

public class Venta extends DocumentoComercial{
    //private Long idVenta;
    //private Double preciobase;
    //private Double igv;
    //private Double preciototal;
    private Cliente dniruc;
    private Usuario idUsuario;
    //private String numDoc;
    private LocalDateTime fechaGener;
    //private String serie;
    //private String tipoDoc;
    private List<VentaDetalle> detalleVenta;

    @Override
    public double calcularTotal() {
        return getPrecioTotal()+getIgv();
    }

    public Venta() {}
    public Venta(Cliente dniruc, Usuario idUsuario, LocalDateTime fechaGener, List<VentaDetalle> detalleVenta) {
        this.dniruc = dniruc;
        this.idUsuario = idUsuario;
        this.fechaGener = fechaGener;
        this.detalleVenta = detalleVenta;
    }
    public Cliente getDniruc() { return dniruc; }
    public void setDniruc(Cliente dniruc) { this.dniruc = dniruc; }
    public Usuario getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Usuario idUsuario) { this.idUsuario = idUsuario; }
    public LocalDateTime getFechaGener() { return fechaGener; }
    public void setFechaGener(LocalDateTime fechaGener) { this.fechaGener = fechaGener; }
    public List<VentaDetalle> getDetalleVenta() { return detalleVenta; }
    public void setDetalleVenta(List<VentaDetalle> detalleVenta) { this.detalleVenta = detalleVenta; }
}
