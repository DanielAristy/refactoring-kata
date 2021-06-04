package co.com.sofka.crud.controller;

import co.com.sofka.crud.persistence.model.Category;
import co.com.sofka.crud.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping("api/categories")
    public Iterable<Category> findAll(){
        return service.list();
    }

    @DeleteMapping("api/category/{id}")
    public void deleteById(@PathVariable(value = "id", required = true) Integer id){
        service.delete(id);
    }

    @PostMapping("api/category")
    public void insert(@RequestBody Category category){
        service.save(category);
    }

    @PutMapping("api/category/{id}")
    public void update(@RequestBody Category category,@PathVariable(value = "id",required = true) Integer id){
        category.setId_category(id);
        service.save(category);
    }
}
