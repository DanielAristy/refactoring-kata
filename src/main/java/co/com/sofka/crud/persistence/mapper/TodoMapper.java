package co.com.sofka.crud.persistence.mapper;

import co.com.sofka.crud.domain.Todo;
import co.com.sofka.crud.persistence.model.ToDo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface TodoMapper {
    @Mappings({
            @Mapping(source = "id_todo", target = "todoId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "completado", target = "completed"),
            @Mapping(source = "categoria", target = "category"),
    })
    Todo toTodo(ToDo toDo);
    List<Todo> toTodos(List<ToDo> toDoList);

    @InheritInverseConfiguration
    ToDo toToDo(Todo todo);
}
