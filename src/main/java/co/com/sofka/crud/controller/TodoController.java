package co.com.sofka.crud.controller;

import co.com.sofka.crud.persistence.dto.TodoDto;
import co.com.sofka.crud.persistence.model.ToDo;
import co.com.sofka.crud.service.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

    @Autowired
    private TodoService service;

    @Autowired
    private ModelMapper mapper;

    @GetMapping(value = "api/todos")
    public Iterable<TodoDto> list(){
        List<ToDo> todos = (List<ToDo>) service.list();
        return todos.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    
    @PostMapping(value = "api/todo")
    public TodoDto save(@RequestBody TodoDto todoDto){
        ToDo todo = convertToEntity(todoDto);
        ToDo todoCreate = service.save(todo);
        return convertToDto(todoCreate);
    }

    @PutMapping(value = "api/todo")
    public TodoDto update(@RequestBody TodoDto todoDto){
        ToDo todo = convertToEntity(todoDto);
        if(todoDto.getId() != null){
            ToDo todoUpdate = service.update(todo);
            return convertToDto(todoUpdate);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }

    @DeleteMapping(value = "api/{id}/todo")
    public void delete(@PathVariable("id")Integer id){
        service.delete(id);
    }

    @GetMapping(value = "api/{id}/todo")
    public ToDo get(@PathVariable("id") Integer id){
        return service.get(id);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
    private TodoDto convertToDto(ToDo todo){
        TodoDto todoDto = mapper.map(todo, TodoDto.class);
        todoDto.setId(todo.getId_todo());
        todoDto.setName(todo.getNombre());
        todoDto.setCompleted(todo.isCompletado());
        todoDto.setCategory(todo.getCategoria());
        return todoDto;
    }

    private ToDo convertToEntity(TodoDto todoDto){
        ToDo todo = mapper.map(todoDto, ToDo.class);

        if (todoDto.getId() != null){
            todo.setId_todo(todoDto.getId());
            todo.setNombre(todoDto.getName());
            todo.setCompletado(todoDto.isCompleted());
            todo.setCategoria(todoDto.getCategory());
        }
        return todo;
    }

}
