package com.StepToJava.demo.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.StepToJava.demo.properties.Test;

import java.util.List;

@Repository

public interface TestRepository extends CrudRepository<Test, Integer> {
    public List<Test> findByUserId(int userId);

}

