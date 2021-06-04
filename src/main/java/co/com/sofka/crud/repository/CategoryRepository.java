package co.com.sofka.crud.repository;


import co.com.sofka.crud.domain.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
