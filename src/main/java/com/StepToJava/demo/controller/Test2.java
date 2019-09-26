package com.StepToJava.demo.controller;

import org.springframework.stereotype.Component;
import com.StepToJava.demo.properties.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Test2 {

        private List<Test> tests = new ArrayList<>(Arrays.asList(

        )
        );
    public List<Test> listAll() {

        return tests;
    }
    }

