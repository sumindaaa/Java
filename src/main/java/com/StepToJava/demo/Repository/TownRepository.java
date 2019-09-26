package com.StepToJava.demo.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.StepToJava.demo.properties.Town;

@Repository

public interface TownRepository extends CrudRepository<Town, Integer> {

}
