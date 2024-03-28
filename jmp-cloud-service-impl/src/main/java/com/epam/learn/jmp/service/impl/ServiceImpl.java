package com.epam.learn.jmp.service.impl;


import com.epam.learn.jmp.dao.SubscriptionDAO;
import com.epam.learn.jmp.dao.UserDAO;
import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.Subscription;
import com.epam.learn.jmp.dto.User;
import com.epam.learn.jmp.service.api.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ServiceImpl implements Service {


    SubscriptionDAO subscriptionDAO;

    UserDAO userDAO;

    ServiceImpl(){
        this.subscriptionDAO = new SubscriptionDAO();
        this.userDAO = new UserDAO();
    }

    @Override
    public void subscribe(BankCard bankCard) {

        if(subscriptionDAO.subscribe(bankCard, LocalDate.now())){
            System.out.println("Subscription completed successfully");
        }else {
            System.out.println("Subscription failed");
        }
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String bankCardNumber) {
        return subscriptionDAO.getAllSubscriptions().
                stream().
                filter(subscription -> subscription.getBankCard().equalsIgnoreCase(bankCardNumber)).
                findFirst();
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
