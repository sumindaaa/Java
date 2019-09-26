package com.StepToJava.demo.Services;

import com.StepToJava.demo.Repository.UserRepository;
import com.StepToJava.demo.properties.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    List<User> Users = new ArrayList<>(Arrays.asList(


    ));
    @Autowired
    private UserRepository userRepository;

    public List<User> listAll() {
        List<User> temp = new ArrayList<>(Arrays.asList(


        ));

        userRepository.findAll().forEach(temp::add);
        return temp;
    }

    public User getUser(int id) {
        User user = null;
        for (User u : listAll()) {
            if (u.getId() == id) {
                user = u;

            }

        }
        return user;
    }


    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user, int id) {
        deleteUser(id);
        userRepository.save(user);

    }


    public void deleteUser(int id) {

        userRepository.deleteById(id);

    }


}









