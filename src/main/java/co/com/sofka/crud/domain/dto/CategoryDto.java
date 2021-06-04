package co.com.sofka.crud.domain.dto;

import co.com.sofka.crud.domain.model.Todo;

import javax.persistence.OneToMany;
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
