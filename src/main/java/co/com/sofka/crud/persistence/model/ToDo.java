package co.com.sofka.crud.persistence.model;

import javax.persistence.*;

@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_todo;
    private String nombre;
    private boolean completado;
    @ManyToOne
    // A traves de esta realacion no vamos a intertar ni actualizar una nueva categoria
    @JoinColumn(name = "id_category", insertable = false,updatable = false)
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria category) {
        this.categoria = category;
    }

    public boolean isCompletado() {
        return completado;
    }
    public void setCompletado(boolean completed) {
        this.completado = completed;
    }
    public void setId_todo(Integer id) {
        this.id_todo = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String name) {
        this.nombre = name;
    }
    public Integer getId_todo() {
        return id_todo;
    }
}
