package com.StepToJava.demo.properties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity

public class User {
    @Id

    private int id;
    private String name;
    private String adress;
    @OneToMany
    List<Test> tests;


    public User() {

    }

    public User(int id, String name, String adress) {
        super();
        this.id = id;
        this.name = name;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
