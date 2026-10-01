package pe.edu.upeu.sysventas.model;



public class Proveedor {
    private Long idProveedor;
    private String dniruc;
    private String nombresRaso;
    private String tipoDoc;
    private String celular;
    private String email;
    private String direccion;

    public Proveedor() {}
    public Proveedor(Long idProveedor, String dniruc, String nombresRaso, String tipoDoc, String celular, String email, String direccion) {
        this.idProveedor = idProveedor;
        this.dniruc = dniruc;
        this.nombresRaso = nombresRaso;
        this.tipoDoc = tipoDoc;
        this.celular = celular;
        this.email = email;
        this.direccion = direccion;
    }
    public Long getIdProveedor() { return idProveedor; }
    public void setIdProveedor(Long idProveedor) { this.idProveedor = idProveedor; }
    public String getDniruc() { return dniruc; }
    public void setDniruc(String dniruc) { this.dniruc = dniruc; }
    public String getNombresRaso() { return nombresRaso; }
    public void setNombresRaso(String nombresRaso) { this.nombresRaso = nombresRaso; }
    public String getTipoDoc() { return tipoDoc; }
    public void setTipoDoc(String tipoDoc) { this.tipoDoc = tipoDoc; }
    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}
