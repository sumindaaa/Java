package com.StepToJava.demo.Services;

import com.StepToJava.demo.Repository.TownRepository;
import com.StepToJava.demo.properties.Town;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TownService {
    List<Town> towns = new ArrayList<>(Arrays.asList(


    ));
    @Autowired
    private TownRepository townRepository;

    public List<Town> listAll() {
        List<Town> temp = new ArrayList<>(Arrays.asList(


        ));

        townRepository.findAll().forEach(temp::add);
        return temp;
    }

    public Town getTown(int id) {
        Town town = null;
        for (Town u : listAll()) {
            if (u.getId() == id) {
                town = u;

            }

        }
        return town;
    }


    public void addTown(Town Town) {
        townRepository.save(Town);
    }

    public void updateTown(Town Town, int id) {
        deleteTown(id);
        townRepository.save(Town);

    }


    public void deleteTown(int id) {

        townRepository.deleteById(id);

    }


}









