package co.com.sofka.crud.domain;

import co.com.sofka.crud.persistence.model.Todo;

import javax.persistence.OneToMany;
import java.util.List;

public class Categoria {
    private Integer categoriaId;
    private String name;
    private List<Todo> todos;

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
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
