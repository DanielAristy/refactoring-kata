package co.com.sofka.crud.persistence.dto;

import co.com.sofka.crud.persistence.model.ToDo;

import java.util.List;

public class CategoryDto {

    private Integer id_category;
    private String name;
    private List<ToDo> todos;

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

    public List<ToDo> getTodos() {
        return todos;
    }

    public void setTodos(List<ToDo> todos) {
        this.todos = todos;
    }
}
