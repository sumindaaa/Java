package com.StepToJava.demo.controller;


import com.StepToJava.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.StepToJava.demo.properties.User;

import java.util.List;

@RestController
public class UserController {

    //UserService userService = new UserService();
    @Autowired
    UserService userService;

    @RequestMapping("/users")

    public List<User> getall() {

        return userService.listAll();
    }

    @RequestMapping
            ("/users/{id}")
    public User getUser(@PathVariable int id) {

        return userService.getUser(id);

    }

    @RequestMapping
            (method = RequestMethod.POST, value = "/users")

    public void addUser(@RequestBody User user) {
        userService.addUser(user);


    }

    @RequestMapping
            (method = RequestMethod.PUT, value = "/users/{id}")

    public void updateUser(@RequestBody User user, @PathVariable int id) {
        userService.updateUser(user, id);


    }

    @RequestMapping
            (method = RequestMethod.DELETE, value = "/users/{id}")

    public void updateUser(@PathVariable int id) {
        userService.deleteUser(id);


    }


}
