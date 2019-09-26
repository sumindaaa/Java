package com.StepToJava.demo.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.StepToJava.demo.properties.User;

@Repository

    public interface UserRepository extends CrudRepository<User, Integer> {

}

