package com.StepToJava.demo.properties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Test {
    @Id
    int id;
    String name;
    @ManyToOne
   User user;

    public Test() {
    }

   public Test(int id, String name, int userId ) {
        super();
        this.id = id;
        this.name = name;
this.user = new User(userId,"","");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
