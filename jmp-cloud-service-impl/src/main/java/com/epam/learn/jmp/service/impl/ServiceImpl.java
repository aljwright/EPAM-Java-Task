package com.epam.learn.jmp.service.impl;


import com.epam.learn.jmp.cmn.exceptions.NoSuchSubscriptionException;
import com.epam.learn.jmp.dao.SubscriptionDAO;
import com.epam.learn.jmp.dao.UserDAO;
import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.Subscription;
import com.epam.learn.jmp.dto.User;
import com.epam.learn.jmp.service.api.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

public class ServiceImpl implements Service {


    /**
     *
     * Reference for the subscriptionDAO to access subscription data
     *
     */
    SubscriptionDAO subscriptionDAO;

    /**
     *
     * Reference for the userDAO to access User data
     *
     */
    UserDAO userDAO;

    /**
     *
     * Instantiate ServiceImpl and needed references
     *
     */
    public ServiceImpl(){
        this.subscriptionDAO = new SubscriptionDAO();
        this.userDAO = new UserDAO();
    }

    /**
     *
     * Create a Subscription with the provided Bank Card
     *
     * @param bankCard
     * Bank Card to used for subscription
     */
    @Override
    public void subscribe(BankCard bankCard) {

        if(subscriptionDAO.subscribe(bankCard, LocalDate.now())){
            System.out.println("Subscription completed successfully");
        }else {
            System.out.println("Subscription failed");
        }

    }

    /**
     *
     * Retrieve BankCard based on the bank Card number provided
     *
     * @param bankCardNumber bank card number
     * @return Subscription with matching bank card number
     * @throws NoSuchSubscriptionException in case of no subscription found with the provided card number
     */
    @Override
    public Subscription getSubscriptionByBankCardNumber(String bankCardNumber) throws NoSuchSubscriptionException {
        return subscriptionDAO.getAllSubscriptions().
                stream().
                filter(subscription -> subscription.getBankCard().equalsIgnoreCase(bankCardNumber)).
                findFirst().orElseThrow(NoSuchSubscriptionException::new);
    }

    /**
     *
     * Retrieve all Users from Storage
     *
     * @return
     * List of Users
     */
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers().stream().toList();
    }

    /**
     *
     * Retrieve all Subscriptions matching certain criteria
     *
     * @param predicate criteria to be matched
     * @return
     * List of Subscriptions matching the criteria
     */
    @Override
    public List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> predicate)  {
        return subscriptionDAO.getAllSubscriptions().
                stream().filter(predicate).
                toList();
    }
}
