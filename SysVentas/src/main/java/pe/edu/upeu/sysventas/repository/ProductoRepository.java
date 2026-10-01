package pe.edu.upeu.sysventas.repository;

import pe.edu.upeu.sysventas.enums.TipoProducto;
import pe.edu.upeu.sysventas.model.Categoria;
import pe.edu.upeu.sysventas.model.Marca;
import pe.edu.upeu.sysventas.model.Producto;
import pe.edu.upeu.sysventas.model.UnidMedida;

public class ProductoRepository extends AbstractJpaRepository<Producto, Long>{
    private long sequence=1;
    @Override
    protected Long getId(Producto entity) {
        return entity.getIdProducto();
    }

    @Override
    protected void setId(Producto entity, Long id) {
        entity.setIdProducto(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }

    public void seedData() {
        if (!findAll().isEmpty()) return;
        String[] marcas = {"Nike", "Adidas", "Jordan", "Puma", "New Atletic"};
        String[] modelos = {"Urban One", "Street Classic", "Court High", "City Pace", "Daily Walk"};
        double[] precios = {249.90, 229.90, 399.90, 199.90, 129.90};
        for (int i = 0; i < marcas.length; i++) {
            agregarTallas(marcas[i], modelos[i], precios[i], (long) i + 1, "Hombre", 38, 43);
            agregarTallas(marcas[i], modelos[i], precios[i], (long) i + 1, "Mujer", 34, 40);
        }
    }

    // Un registro por marca, modelo, público y talla.
    private void agregarTallas(String marca, String modelo, double precio, Long idMarca,
                              String genero, int primera, int ultima) {
        for (int talla = primera; talla <= ultima; talla++) {
            save(new Producto(null, modelo, TipoProducto.PRODUCTO, precio,
                0.0, 0.0, 5.0, 0.0, new Categoria(1L, "Urbana"),
                new Marca(idMarca, marca), new UnidMedida(1L, "Par"), genero, talla));
        }
    }
}
