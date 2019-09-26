package com.StepToJava.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.StepToJava.demo.properties.Town;
import com.StepToJava.demo.Services.TownService;

import java.util.List;

@RestController
public class TownController {

    TownService townService = new TownService();

    @RequestMapping("/towns")

    public List<Town> getall() {

        return townService.listAll();
    }

    @RequestMapping
            ("/towns/{id}")
    public Town getTown(@PathVariable int id) {

        return townService.getTown(id);

    }

    @RequestMapping
            (method = RequestMethod.POST, value = "/towns")

    public void addTown(@RequestBody Town town){
        townService.addTown(town);


    }

    @RequestMapping
            (method = RequestMethod.PUT, value = "/towns/{id}")

    public void updateTown(@RequestBody Town town, @PathVariable int id){
        townService.updateTown(town, id);


    }

    @RequestMapping
            (method = RequestMethod.DELETE, value = "/towns/{id}")

    public void updateTown(@PathVariable int id){
        townService.deleteTown(id);


    }


}