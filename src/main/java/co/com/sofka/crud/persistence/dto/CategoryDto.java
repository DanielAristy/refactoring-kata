package co.com.sofka.crud.persistence.dto;

import co.com.sofka.crud.persistence.model.Todo;

import java.util.List;

public class CategoryDto {

    private Integer id_category;
    private String name;
    private List<Todo> todos;

    public Integer getId_category() {
        return id_category;
    }

    public void setId_category(Integer id_category) {
        this.id_category = id_category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }
}
