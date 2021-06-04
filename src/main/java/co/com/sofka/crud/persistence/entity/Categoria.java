package co.com.sofka.crud.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categoria;
    private String nombre;
    @OneToMany(mappedBy = "categoria")
    private List<ToDo> todos;

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id) {
        this.id_categoria = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public void setTodos(List<ToDo> todos) {
        this.todos = todos;
    }
}
