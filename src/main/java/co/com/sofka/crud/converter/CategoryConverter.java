package co.com.sofka.crud.converter;

import co.com.sofka.crud.domain.dto.CategoryDto;
import co.com.sofka.crud.domain.dto.TodoDto;
import co.com.sofka.crud.domain.model.Category;
import co.com.sofka.crud.domain.model.Todo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {
//    @Autowired
//    private ModelMapper mapper;
//
//    @Bean
//    public ModelMapper modelMapper() {
//        return new ModelMapper();
//    }
//    public CategoryDto convertToDto(Category category){
//        CategoryDto categoryDto = mapper.map(category, CategoryDto.class);
//        categoryDto.setId_category(category.getId_category());
//        categoryDto.setName(category.getName());
//        categoryDto.setTodos(category.getTodos());
//
//        return categoryDto;
//    }
//
//    public Category convertToEntity(CategoryDto categoryDto){
//        Category category = mapper.map(categoryDto, Category.class);
//
//        if (categoryDto.getId_category() != null){
//            category.setId_category(categoryDto.getId_category());
//            category.setName(categoryDto.getName());
//            category.setTodos(categoryDto.getTodos());
//        }
//        return category;
//    }
}
