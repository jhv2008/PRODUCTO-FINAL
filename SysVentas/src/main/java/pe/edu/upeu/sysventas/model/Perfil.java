package pe.edu.upeu.sysventas.model;


import java.util.List;

public class Perfil {
    private Long idPerfil;
    private String nombre;
    private String codigo;
    private List<Acceso> accesos;

    public Perfil() {}
    public Perfil(Long idPerfil, String nombre, String codigo, List<Acceso> accesos) {
        this.idPerfil = idPerfil;
        this.nombre = nombre;
        this.codigo = codigo;
        this.accesos = accesos;
    }
    public Long getIdPerfil() { return idPerfil; }
    public void setIdPerfil(Long idPerfil) { this.idPerfil = idPerfil; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public List<Acceso> getAccesos() { return accesos; }
    public void setAccesos(List<Acceso> accesos) { this.accesos = accesos; }
}
