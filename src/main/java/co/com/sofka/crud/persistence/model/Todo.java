package co.com.sofka.crud.persistence.model;

import javax.persistence.*;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_todo;
    private String name;
    private boolean completed;
    @ManyToOne
    // A traves de esta realacion no vamos a intertar ni actualizar una nueva categoria
    @JoinColumn(name = "id_category", insertable = false,updatable = false)
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public void setId_todo(Integer id) {
        this.id_todo = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getId_todo() {
        return id_todo;
    }
}
