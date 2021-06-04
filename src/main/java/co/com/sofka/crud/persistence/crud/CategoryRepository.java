package co.com.sofka.crud.persistence.crud;


import co.com.sofka.crud.persistence.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
