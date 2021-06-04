package co.com.sofka.crud.service.impl;

import co.com.sofka.crud.persistence.model.ToDo;
import co.com.sofka.crud.persistence.crud.TodoRepository;
import co.com.sofka.crud.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository repository;

    @Override
    public Iterable<ToDo> list() {
        return repository.findAll();
    }

    @Override
    public ToDo save(ToDo todo) {
        return repository.save(todo);
    }

    @Override
    public ToDo update(ToDo todo) {
        return repository.save(todo);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(get(id));
    }

    @Override
    public ToDo get(Integer id) {
        return repository.findById(id).orElseThrow();
    }
}
