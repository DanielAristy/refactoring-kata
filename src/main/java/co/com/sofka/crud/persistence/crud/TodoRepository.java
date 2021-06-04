package co.com.sofka.crud.persistence.crud;

import co.com.sofka.crud.persistence.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<ToDo, Integer> {
}
