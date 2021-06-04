package co.com.sofka.crud.service;

import co.com.sofka.crud.persistence.entity.Categoria;

public interface CategoryService {

    public Iterable<Categoria> list();
    public Categoria save(Categoria category);
    public Categoria update(Categoria category);
    public void delete(Integer id);
    public Categoria get(Integer id);
}
