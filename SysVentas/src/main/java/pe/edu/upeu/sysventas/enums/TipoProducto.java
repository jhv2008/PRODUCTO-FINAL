package pe.edu.upeu.sysventas.enums;
public enum TipoProducto {
    PRODUCTO("Zapatilla");
    private final String descripcion;
    TipoProducto(String descripcion) { this.descripcion = descripcion; }
    public String getDescripcion() { return descripcion; }
}
