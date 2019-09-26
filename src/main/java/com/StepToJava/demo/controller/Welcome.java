package com.StepToJava.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {



        @RequestMapping("/welcome")

        public String welcome() {

            return "Welcome";
        }



}
