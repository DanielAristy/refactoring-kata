package co.com.sofka.crud.persistence.crud;


import co.com.sofka.crud.persistence.model.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Categoria, Integer> {
}
