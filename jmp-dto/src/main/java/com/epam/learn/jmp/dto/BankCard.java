package com.epam.learn.jmp.dto;

public class BankCard {

    /**
     * unique 16-Digit Number to identify the bank card
     */
    String number;

    /**
     * User reference to hold User information
     */
    User user;

    /**
     * Get Bank Card number
     * @return
     *
     * Bank Card Number
     */
    public String getNumber() {
        return number;
    }

    /**
     *
     * Set Bank Card Number
     * @param number to be set in the Bank Card Object
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     *
     * Get User of the Bank Card
     * @return
     * User of the Bank Card
     */
    public User getUser() {
        return user;
    }

    /**
     * Set the User of the Bank Card
     * @param user to be set in the bank card
     *
     */
    public void setUser(User user) {
        this.user = user;
    }
}
