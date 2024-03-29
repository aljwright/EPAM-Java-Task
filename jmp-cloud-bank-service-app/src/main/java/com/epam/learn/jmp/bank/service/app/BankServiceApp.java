package com.epam.learn.jmp.bank.service.app;

import com.epam.learn.jmp.bank.api.Bank;
import com.epam.learn.jmp.bank.impl.BankImpl;
import com.epam.learn.jmp.cmn.exceptions.NoSuchSubscriptionException;
import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.BankCardType;
import com.epam.learn.jmp.dto.Subscription;
import com.epam.learn.jmp.dto.User;
import com.epam.learn.jmp.service.api.Service;
import com.epam.learn.jmp.service.impl.ServiceImpl;

import java.util.List;
import java.util.Optional;

public class BankServiceApp {


    Bank bank;

    Service service;


    public BankServiceApp(){
        this.bank = new BankImpl();
        this.service = new ServiceImpl();
    }

    public Service getService() {
        return service;
    }

    public Bank getBank(){
        return this.bank;
    }


    /**
     * Main Method to test the functionalities of the classes
     * @param args runtime args
     */
    public static void main (String [] args){

        BankServiceApp app = new BankServiceApp();

        var averageAge = app.getService().getAverageUsersAge();

        System.out.println("averageAge - "+averageAge);

        Optional<User> optUser = app.getService().
                getAllUsers().
                stream().
                filter(indUser -> indUser.getName().equalsIgnoreCase("Alex") ).
                findFirst();

        User user = optUser.orElse(new User());

        BankCard bankCard = app.getBank().createBankCard(user, BankCardType.DEBIT);

        app.getService().subscribe(bankCard);

        try {
            Subscription subscription =  app.getService().getSubscriptionByBankCardNumber("234625347265472647");
            System.out.println("retrieved subscription --"+subscription.getBankCard());
        } catch (NoSuchSubscriptionException e) {
            System.out.println("expected exception error --" + e.getMessage());
        }


        List<Subscription> subscriptionList = app.getService().
                getAllSubscriptionsByCondition((subscription -> subscription.getBankCard().equalsIgnoreCase(bankCard.getNumber())));

        subscriptionList.forEach(subscription -> System.out.println(subscription.getBankCard()));

        System.out.println("is "+ user.getName() +" a payable user -- "+Service.isPayableUser(user));

    }




}
