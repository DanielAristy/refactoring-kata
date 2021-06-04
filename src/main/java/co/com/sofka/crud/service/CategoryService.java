package co.com.sofka.crud.service;

import co.com.sofka.crud.domain.dto.CategoryDto;
import co.com.sofka.crud.domain.model.Category;

public interface CategoryService {

    public Iterable<Category> list();
    public Category save(Category category);
    public Category update(Category category);
    public void delete(Integer id);
    public Category get(Integer id);
}