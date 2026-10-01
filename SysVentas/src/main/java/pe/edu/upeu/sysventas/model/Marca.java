package pe.edu.upeu.sysventas.model;



public class Marca {
    private Long idMarca;

    private String nombre;

    public Marca() {}
    public Marca(Long idMarca, String nombre) {
        this.idMarca = idMarca;
        this.nombre = nombre;
    }
    public Long getIdMarca() { return idMarca; }
    public void setIdMarca(Long idMarca) { this.idMarca = idMarca; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
