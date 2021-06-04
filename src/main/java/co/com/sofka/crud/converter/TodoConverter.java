package co.com.sofka.crud.converter;

import org.springframework.stereotype.Component;

@Component
public class TodoConverter {

//    @Autowired
//    private ModelMapper mapper;
//
//    @Bean
//    public ModelMapper modelMapper() {
//        return new ModelMapper();
//    }
//    private TodoDto convertToDto(Todo todo){
//        TodoDto todoDto = mapper.map(todo, TodoDto.class);
//        todoDto.setId(todo.getId_todo());
//        todoDto.setName(todo.getName());
//        todoDto.setCompleted(todo.isCompleted());
//        todoDto.setCategory(todo.getCategory());
//        return todoDto;
//    }
//
//    private Todo convertToEntity(TodoDto todoDto){
//        Todo todo = mapper.map(todoDto, Todo.class);
//
//        if (todoDto.getId() != null){
//            todo.setId_todo(todoDto.getId());
//            todo.setName(todoDto.getName());
//            todo.setCompleted(todoDto.isCompleted());
//            todo.setCategory(todoDto.getCategory());
//        }
//        return todo;
//    }
}
