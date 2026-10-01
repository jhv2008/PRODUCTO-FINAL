package pe.edu.upeu.sysventas.model;

import pe.edu.upeu.sysventas.enums.TipoDocumento;
public class Cliente {
    private String dniruc;
    private String nombres;
    private String repLegal;
    private String direccion;
    private TipoDocumento tipoDocumento;

    public Cliente() {}
    public Cliente(String dniruc, String nombres, String repLegal, String direccion, TipoDocumento tipoDocumento) {
        this.dniruc = dniruc;
        this.nombres = nombres;
        this.repLegal = repLegal;
        this.direccion = direccion;
        this.tipoDocumento = tipoDocumento;
    }
    public String getDniruc() { return dniruc; }
    public void setDniruc(String dniruc) { this.dniruc = dniruc; }
    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }
    public String getRepLegal() { return repLegal; }
    public void setRepLegal(String repLegal) { this.repLegal = repLegal; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public TipoDocumento getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(TipoDocumento tipoDocumento) { this.tipoDocumento = tipoDocumento; }
}
