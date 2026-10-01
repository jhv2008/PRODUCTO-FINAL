package pe.edu.upeu.sysventas.model;


public class Usuario {
    private Long idUsuario;
    private String usuario;
    private String clave;
    private Perfil idPerfil;
    private String estado;

    public Usuario() {}
    public Usuario(Long idUsuario, String usuario, String clave, Perfil idPerfil, String estado) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.clave = clave;
        this.idPerfil = idPerfil;
        this.estado = estado;
    }
    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
    public Perfil getIdPerfil() { return idPerfil; }
    public void setIdPerfil(Perfil idPerfil) { this.idPerfil = idPerfil; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
