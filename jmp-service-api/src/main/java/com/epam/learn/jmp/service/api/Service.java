package com.epam.learn.jmp.service.api;

import com.epam.learn.jmp.cmn.exceptions.NoSuchSubscriptionException;
import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.Subscription;
import com.epam.learn.jmp.dto.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;


public interface Service {


    /**
     *
     * Get Average of the age of Users in storage
     *
     * @return
     * double - average of the age of the Users
     */
    default double getAverageUsersAge(){

        OptionalDouble averageAge = getAllUsers().
                stream()
                .mapToLong(user -> ChronoUnit.YEARS.between(user.getBirthday(),LocalDate.now())).
                average();

        return averageAge.orElse(0);

    }

    /**
     *
     * Check if User is a payable user / is older than 18
     *
     * @param user user to be validated
     * @return
     * boolean to indicate if the user is a payable user or not
     */
    static boolean isPayableUser(User user){
        return (ChronoUnit.YEARS.between(user.getBirthday(),LocalDate.now())>=18);
    }

    /**
     *
     * Create a Subscription with the provided Bank Card
     *
     * @param bankCard
     * Bank Card to used for subscription
     */
    void subscribe(BankCard bankCard);

    /**
     *
     * Retrieve BankCard based on the bank Card number provided
     *
     * @param bankCardNumber bank card number
     * @return Subscription with matching bank card number
     * @throws NoSuchSubscriptionException in case of no subscription found with the provided card number
     */
    Subscription getSubscriptionByBankCardNumber(String bankCardNumber) throws NoSuchSubscriptionException;

    /**
     *
     * Retrieve all Users from Storage
     *
     * @return
     * List of Users
     */
    List<User> getAllUsers();


    /**
     *
     * Retrieve all Subscriptions matching certain criteria
     *
     * @param predicate criteria to be matched
     * @return
     * List of Subscriptions matching the criteria
     */
    List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> predicate);


}
