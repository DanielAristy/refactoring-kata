package co.com.sofka.crud.persistence.crud;

import co.com.sofka.crud.persistence.entity.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface TodoCrudRepository extends CrudRepository<ToDo, Integer> {
}
