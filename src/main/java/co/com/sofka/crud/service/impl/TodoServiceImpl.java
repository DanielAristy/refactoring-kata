package co.com.sofka.crud.service.impl;

import co.com.sofka.crud.persistence.model.Todo;
import co.com.sofka.crud.persistence.crud.TodoRepository;
import co.com.sofka.crud.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository repository;

    @Override
    public Iterable<Todo> list() {
        return repository.findAll();
    }

    @Override
    public Todo save(Todo todo) {
        return repository.save(todo);
    }

    @Override
    public Todo update(Todo todo) {
        return repository.save(todo);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(get(id));
    }

    @Override
    public Todo get(Integer id) {
        return repository.findById(id).orElseThrow();
    }
}
