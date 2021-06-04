package co.com.sofka.crud.persistence.mapper;

import co.com.sofka.crud.domain.Category;
import co.com.sofka.crud.persistence.model.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "id_categoria",target = "categoryId"),
            @Mapping(source = "nombre",target = "name")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration //Mapeo inverso al que tenemos
    @Mapping(target = "todos", ignore = true) //No va a ser mapedos los Todos
    Categoria toCategoria(Category category);

}
