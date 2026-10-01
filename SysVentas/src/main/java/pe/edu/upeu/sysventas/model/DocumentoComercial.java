package pe.edu.upeu.sysventas.model;


public abstract class DocumentoComercial {
    private Long id;
    private double precioBase;
    private double igv;
    private double precioTotal;
    private String serie;
    private String numDoc;
    private String tipoDoc;

    public abstract double calcularTotal();

    public DocumentoComercial() {}
    public DocumentoComercial(Long id, double precioBase, double igv, double precioTotal, String serie, String numDoc, String tipoDoc) {
        this.id = id;
        this.precioBase = precioBase;
        this.igv = igv;
        this.precioTotal = precioTotal;
        this.serie = serie;
        this.numDoc = numDoc;
        this.tipoDoc = tipoDoc;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    public double getIgv() { return igv; }
    public void setIgv(double igv) { this.igv = igv; }
    public double getPrecioTotal() { return precioTotal; }
    public void setPrecioTotal(double precioTotal) { this.precioTotal = precioTotal; }
    public String getSerie() { return serie; }
    public void setSerie(String serie) { this.serie = serie; }
    public String getNumDoc() { return numDoc; }
    public void setNumDoc(String numDoc) { this.numDoc = numDoc; }
    public String getTipoDoc() { return tipoDoc; }
    public void setTipoDoc(String tipoDoc) { this.tipoDoc = tipoDoc; }
}
