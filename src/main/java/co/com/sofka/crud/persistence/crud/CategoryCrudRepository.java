package co.com.sofka.crud.persistence.crud;

import co.com.sofka.crud.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Categoria, Integer> {
}
