package com.StepToJava.demo.properties;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Town {
    @Id
    private int id;
    private String name;

    public Town() {
    }

    public Town(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
