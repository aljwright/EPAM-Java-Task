package com.epam.learn.jmp.dao;

import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.Subscription;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SubscriptionDAO {

    List<Subscription> subscriptions ;

    public SubscriptionDAO(){
        subscriptions = new ArrayList<>();
    }

    public boolean subscribe(BankCard bankCard, LocalDate subscriptionStartDate){

        Subscription subscription = new Subscription();
        subscription.setBankCard(bankCard.getNumber());
        subscription.setStartDate(subscriptionStartDate);
        subscriptions.add(subscription);

        return true;
    }

   public List<Subscription> getAllSubscriptions(){

        return new ArrayList<>();
   }

}
