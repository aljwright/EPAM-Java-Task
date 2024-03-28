package com.epam.learn.jmp.dao;

import com.epam.learn.jmp.dto.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    List<User> users ;

    public UserDAO(){
        users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
    }

    public List<User> getAllUsers(){

        return users;
    }
}
