package com.epam.learn.jmp.dao;

import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.Subscription;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SubscriptionDAO {

    List<Subscription> subscriptions ;

    /**
     * Instantiate SubscriptionDAO
     */
    public SubscriptionDAO(){
        subscriptions = new ArrayList<>();
    }

    /**
     *
     * Create a subscription for the provided Bank Card with provided date
     * as subscription start date
     *
     * @param bankCard bank card to be used for subscription
     * @param subscriptionStartDate date to indicate subscription start date
     * @return
     * boolean to indicate status of the subscribe operation
     *
     */
    public boolean subscribe(BankCard bankCard, LocalDate subscriptionStartDate){

        if(Objects.isNull(bankCard) || Objects.isNull(subscriptionStartDate)){
            return false;
        }

        Subscription subscription = new Subscription();
        subscription.setBankCard(bankCard.getNumber());
        subscription.setStartDate(subscriptionStartDate);
        subscriptions.add(subscription);

        return true;
    }

    /**
     *
     * Get All Subscriptions from memory
     *
     * @return
     * List of Subscriptions
     */
   public List<Subscription> getAllSubscriptions(){
        return this.subscriptions.stream().toList();
   }

}
