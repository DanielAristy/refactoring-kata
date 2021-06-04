package co.com.sofka.crud.service.impl;

import co.com.sofka.crud.persistence.entity.Categoria;
import co.com.sofka.crud.persistence.crud.CategoryCrudRepository;
import co.com.sofka.crud.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryCrudRepository repository;


    @Override
    public Iterable<Categoria> list() {
        return repository.findAll();
    }

    @Override
    public Categoria save(Categoria category) {
        return repository.save(category);
    }

    @Override
    public Categoria update(Categoria category) {
        return repository.save(category);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(get(id));
    }

    @Override
    public Categoria get(Integer id) {
        return repository.findById(id).orElseThrow();
    }
}
