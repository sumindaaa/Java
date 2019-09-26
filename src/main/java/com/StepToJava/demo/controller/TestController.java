package com.StepToJava.demo.controller;


import com.StepToJava.demo.Services.TestService;
import com.StepToJava.demo.properties.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.StepToJava.demo.properties.Test;

import java.util.List;

@RestController
public class TestController {

    //TestService TestService = new TestService();
    @Autowired
    TestService TestService;

    @RequestMapping("/users/{id}/tests")

    public List<Test> getall(@PathVariable int id) {

        return TestService.listAll(id);
    }

    @RequestMapping
            ("/users/{userId}/tests/{id}")
    public Test getTest(@PathVariable int id) {

        return TestService.getTest(id);

    }

    @RequestMapping
            (method = RequestMethod.POST, value = "/users/{userId}/tests")

    public void addTest(@RequestBody Test test, @PathVariable int userId) {
        test.setUser(new User(userId,"",""));

        TestService.addTest(test);


    }

    @RequestMapping
            (method = RequestMethod.PUT, value = "/users/{userId}/tests/{id}")

    public void updateTest(@RequestBody Test test, @PathVariable int id) {
        TestService.updateTest(test, id);


    }

    @RequestMapping
            (method = RequestMethod.DELETE, value = "/users/{userId}/tests/{id}")

    public void updateTest(@PathVariable int id) {
        TestService.deleteTest(id);


    }


}
