package co.com.sofka.crud.service;

import co.com.sofka.crud.persistence.model.Todo;

public interface TodoService {

    public Iterable<Todo> list();
    public Todo save(Todo todo);
    public Todo update(Todo todo);
    public void delete(Integer id);
    public Todo get(Integer id);

}
