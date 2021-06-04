package co.com.sofka.crud.domain;

import co.com.sofka.crud.domain.Todo;
import co.com.sofka.crud.persistence.entity.ToDo;

import java.util.List;
import java.util.Optional;

public interface TodoReposity {
    List<Todo> getAll();
    Todo save(Todo todo);
    void delete(int todoId);
    Todo Update(Todo todo);
}
