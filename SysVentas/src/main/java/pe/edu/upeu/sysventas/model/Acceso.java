package pe.edu.upeu.sysventas.model;

import pe.edu.upeu.sysventas.enums.Menus;
import pe.edu.upeu.sysventas.enums.TipoTab;

public class Acceso {
    private String idAcceso;
    private String urlAcceso;
    private String menuItemNombre;
    private Menus menuNombre;
    private TipoTab nombreTab;


    public Acceso() {}
    public Acceso(String idAcceso, String urlAcceso, String menuItemNombre, Menus menuNombre, TipoTab nombreTab) {
        this.idAcceso = idAcceso;
        this.urlAcceso = urlAcceso;
        this.menuItemNombre = menuItemNombre;
        this.menuNombre = menuNombre;
        this.nombreTab = nombreTab;
    }
    public String getIdAcceso() { return idAcceso; }
    public void setIdAcceso(String idAcceso) { this.idAcceso = idAcceso; }
    public String getUrlAcceso() { return urlAcceso; }
    public void setUrlAcceso(String urlAcceso) { this.urlAcceso = urlAcceso; }
    public String getMenuItemNombre() { return menuItemNombre; }
    public void setMenuItemNombre(String menuItemNombre) { this.menuItemNombre = menuItemNombre; }
    public Menus getMenuNombre() { return menuNombre; }
    public void setMenuNombre(Menus menuNombre) { this.menuNombre = menuNombre; }
    public TipoTab getNombreTab() { return nombreTab; }
    public void setNombreTab(TipoTab nombreTab) { this.nombreTab = nombreTab; }
}
