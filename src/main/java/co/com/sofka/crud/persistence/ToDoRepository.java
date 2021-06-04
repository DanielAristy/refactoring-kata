package co.com.sofka.crud.persistence;

import co.com.sofka.crud.domain.Todo;
import co.com.sofka.crud.domain.TodoReposity;
import co.com.sofka.crud.persistence.crud.TodoCrudRepository;
import co.com.sofka.crud.persistence.entity.ToDo;
import co.com.sofka.crud.persistence.mapper.TodoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ToDoRepository implements TodoReposity {

    private TodoCrudRepository todoCrudRepository;
    private TodoMapper mapper;


    @Override
    public List<Todo> getAll() {
        Iterable<ToDo> todos = todoCrudRepository.findAll();
        return mapper.toTodos((List<ToDo>) todos);
    }

    @Override
    public Todo save(Todo todo) {
        ToDo toDo = mapper.toToDo(todo);
        return mapper.toTodo(todoCrudRepository.save(toDo));
    }

    @Override
    public void delete(int todoId) {
        todoCrudRepository.deleteById(todoId);
    }

    @Override
    public Todo Update(Todo todo) {
        ToDo toDo = mapper.toToDo(todo);
        return mapper.toTodo(todoCrudRepository.save(toDo));
    }
}
