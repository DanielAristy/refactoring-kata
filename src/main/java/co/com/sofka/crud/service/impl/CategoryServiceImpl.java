package co.com.sofka.crud.service.impl;

import co.com.sofka.crud.converter.CategoryConverter;
import co.com.sofka.crud.domain.dto.CategoryDto;
import co.com.sofka.crud.domain.model.Category;
import co.com.sofka.crud.repository.CategoryRepository;
import co.com.sofka.crud.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository repository;


    @Override
    public Iterable<Category> list() {
        return repository.findAll();
    }

    @Override
    public Category save(Category category) {
        return repository.save(category);
    }

    @Override
    public Category update(Category category) {
        return repository.save(category);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(get(id));
    }

    @Override
    public Category get(Integer id) {
        return repository.findById(id).orElseThrow();
    }
}
