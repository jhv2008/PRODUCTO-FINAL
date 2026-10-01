package pe.edu.upeu.sysventas.repository;

import pe.edu.upeu.sysventas.model.Marca;

public class MarcaRepository extends AbstractJpaRepository<Marca,Long> {
    private long sequence=1;
    @Override
    protected Long getId(Marca entity) {
        return entity.getIdMarca();
    }

    @Override
    protected void setId(Marca entity, Long id) {
        entity.setIdMarca(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }

    public void seedData() {
        if (findAll().isEmpty()) {
            save(new Marca(generateId(), "Nike"));
            save(new Marca(generateId(),"Adidas"));
            save(new Marca(generateId(),"Jordan"));
            save(new Marca(generateId(),"Puma"));
            save(new Marca(generateId(),"New Atletic"));
        }
    }
}
