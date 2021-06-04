package co.com.sofka.crud.persistence.dto;

import co.com.sofka.crud.persistence.model.Categoria;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

public class TodoDto implements Serializable {
    private Integer id;
    private String name;
    private boolean completed;
    private Categoria category;

    public Categoria getCategory() {
        return category;
    }

    public void setCategory(Categoria category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return StringUtils.defaultString(name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
