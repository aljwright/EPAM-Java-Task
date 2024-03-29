package com.epam.learn.jmp.dao;

import com.epam.learn.jmp.dto.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDAO {

    List<User> users ;

    /**
     * Instantiate UserDAO
     */
    public UserDAO(){
        users = new ArrayList<>();

        User firstSampleUser = new User();
        firstSampleUser.setName("Alex");
        firstSampleUser.setSurName("Wright");
        firstSampleUser.setBirthday(LocalDate.of(1992,4,17));

        User secondSampleUser = new User();
        secondSampleUser.setName("Darius");
        secondSampleUser.setSurName("Wright");
        secondSampleUser.setBirthday(LocalDate.of(2021,11,3));

        User thirdSampleUser = new User();
        thirdSampleUser.setName("Josh");
        thirdSampleUser.setName("Mathews");
        thirdSampleUser.setBirthday(LocalDate.of(2001,3,16));

        users.add(firstSampleUser);
        users.add(secondSampleUser);
        users.add(thirdSampleUser);
    }

    /**
     * Get All Users from storage
     * @return
     * List of Users
     */
    public List<User> getAllUsers(){

        return Collections.unmodifiableList(this.users);

    }
}
