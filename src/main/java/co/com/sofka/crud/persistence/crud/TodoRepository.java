package co.com.sofka.crud.persistence.crud;

import co.com.sofka.crud.persistence.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
}
