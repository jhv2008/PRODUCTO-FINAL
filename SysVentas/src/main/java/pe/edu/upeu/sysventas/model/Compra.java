package pe.edu.upeu.sysventas.model;

import java.time.LocalDate;
import java.util.List;

public class Compra extends DocumentoComercial {

    //private Long idCompra;
    //private Double precioBase;
    //private Double igv;
    //private Double preciototal;
    private Proveedor idProveedor;
    private Usuario idUsuario;
    //private String serie;
    //private String numDoc;
    private LocalDate fechaComp;
    //private String tipoDoc;
    private LocalDate fechaReg;
    private List<CompraDetalle> detalleCompra;

    @Override
    public double calcularTotal() {
        return getPrecioTotal()+getIgv();
    }

    public Compra() {}
    public Compra(Proveedor idProveedor, Usuario idUsuario, LocalDate fechaComp, LocalDate fechaReg, List<CompraDetalle> detalleCompra) {
        this.idProveedor = idProveedor;
        this.idUsuario = idUsuario;
        this.fechaComp = fechaComp;
        this.fechaReg = fechaReg;
        this.detalleCompra = detalleCompra;
    }
    public Proveedor getIdProveedor() { return idProveedor; }
    public void setIdProveedor(Proveedor idProveedor) { this.idProveedor = idProveedor; }
    public Usuario getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Usuario idUsuario) { this.idUsuario = idUsuario; }
    public LocalDate getFechaComp() { return fechaComp; }
    public void setFechaComp(LocalDate fechaComp) { this.fechaComp = fechaComp; }
    public LocalDate getFechaReg() { return fechaReg; }
    public void setFechaReg(LocalDate fechaReg) { this.fechaReg = fechaReg; }
    public List<CompraDetalle> getDetalleCompra() { return detalleCompra; }
    public void setDetalleCompra(List<CompraDetalle> detalleCompra) { this.detalleCompra = detalleCompra; }
}
