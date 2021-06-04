package co.com.sofka.crud.domain;

import co.com.sofka.crud.persistence.model.Categoria;

public class Todo {
    private Integer todoId;
    private String name;
    private boolean completed;
    private Categoria category;

    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Categoria getCategory() {
        return category;
    }

    public void setCategory(Categoria category) {
        this.category = category;
    }
}
