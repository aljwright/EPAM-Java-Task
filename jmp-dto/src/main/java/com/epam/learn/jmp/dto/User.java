package com.epam.learn.jmp.dto;

import java.time.LocalDate;

public class User {

    /**
     *
     * Holder for name of the User
     *
     */
    private String name;

    /**
     *
     * Holder for surName of the User
     *
     */
    private String surName;

    /**
     *
     * Holder for storing the birthdate of the User
     *
     */
    private LocalDate birthday;

    /**
     *
     * Get the name of the User
     *
     * @return
     * Name of the User
     */
    public String getName() {
        return name;
    }

    /**
     *
     * Set the name of the User
     *
     * @param name
     * Name of the User
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * Get surName of the User
     *
     * @return
     * surName of the User
     */
    public String getSurName() {
        return surName;
    }

    /**
     *
     * set surName of the User
     *
     * @param surName
     * surName of the User
     */
    public void setSurName(String surName) {
        this.surName = surName;
    }

    /**
     *
     * Get the Birthdate of the User
     *
     * @return
     * Birthdate of the User
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     *
     * Set the Birthdate of the User
     * @param birthday
     * Birthdate of the User
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
