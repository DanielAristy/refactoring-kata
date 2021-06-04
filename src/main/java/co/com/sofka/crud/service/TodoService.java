package co.com.sofka.crud.service;

import co.com.sofka.crud.persistence.entity.ToDo;

public interface TodoService {

    public Iterable<ToDo> list();
    public ToDo save(ToDo todo);
    public ToDo update(ToDo todo);
    public void delete(Integer id);
    public ToDo get(Integer id);

}
