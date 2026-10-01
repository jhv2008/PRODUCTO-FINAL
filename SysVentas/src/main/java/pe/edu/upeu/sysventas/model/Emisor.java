package pe.edu.upeu.sysventas.model;


public class Emisor {
    private Long idEmisor;
    private String ruc;
    private String nombreComercial;
    private String ubigeo;
    private String domicilioFiscal;
    private String urbanizacion;
    private String departamento;
    private String provincia;
    private String distrito;

    public Emisor() {}
    public Emisor(Long idEmisor, String ruc, String nombreComercial, String ubigeo, String domicilioFiscal, String urbanizacion, String departamento, String provincia, String distrito) {
        this.idEmisor = idEmisor;
        this.ruc = ruc;
        this.nombreComercial = nombreComercial;
        this.ubigeo = ubigeo;
        this.domicilioFiscal = domicilioFiscal;
        this.urbanizacion = urbanizacion;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
    }
    public Long getIdEmisor() { return idEmisor; }
    public void setIdEmisor(Long idEmisor) { this.idEmisor = idEmisor; }
    public String getRuc() { return ruc; }
    public void setRuc(String ruc) { this.ruc = ruc; }
    public String getNombreComercial() { return nombreComercial; }
    public void setNombreComercial(String nombreComercial) { this.nombreComercial = nombreComercial; }
    public String getUbigeo() { return ubigeo; }
    public void setUbigeo(String ubigeo) { this.ubigeo = ubigeo; }
    public String getDomicilioFiscal() { return domicilioFiscal; }
    public void setDomicilioFiscal(String domicilioFiscal) { this.domicilioFiscal = domicilioFiscal; }
    public String getUrbanizacion() { return urbanizacion; }
    public void setUrbanizacion(String urbanizacion) { this.urbanizacion = urbanizacion; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }
    public String getDistrito() { return distrito; }
    public void setDistrito(String distrito) { this.distrito = distrito; }
}
