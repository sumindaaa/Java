package com.StepToJava.demo.Services;

import com.StepToJava.demo.Repository.TestRepository;
import com.StepToJava.demo.properties.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TestService {
    List<Test> Tests = new ArrayList<>(Arrays.asList(

            //new Test(2, "katu"),
            // new Test(3, "katu")
    ));
    @Autowired
    private TestRepository testRepository;

    public List<Test> listAll(int userId) {
        List<Test> temp = new ArrayList<>(Arrays.asList(


        ));

        testRepository.findByUserId(userId).forEach(temp::add);
        return temp;
    }


    /*public List<Test> listAll() {


        testRepository.findAll().forEach(Tests::add);
        return Tests;
    }

     }*/
    public Test getTest(int id) {
        Test test = new Test();
        for (Test u : Tests) {
            if (u.getId() == id) {
                test = u;

            }

        }
        return test;


    }


    public void addTest(Test test) {
        testRepository.save(test);
    }

    public void updateTest(Test test, int id) {

        testRepository.save(test);

    }


    public void deleteTest(int id) {

        testRepository.deleteById(id);

    }


}









