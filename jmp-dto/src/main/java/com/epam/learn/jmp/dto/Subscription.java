package com.epam.learn.jmp.dto;

import java.time.LocalDate;

/**
 *
 * Class to hold the Subscription data
 *
 */
public class Subscription {

    /**
     * Holder for bank card number
     */
    String bankCard;

    /**
     *
     * Holder for subscription start date
     *
     */
    LocalDate startDate;

    /**
     *
     * Get Bank card number
     * @return
     * Bank Card Number
     */
    public String getBankCard() {
        return bankCard;
    }

    /**
     *
     * Set Bank Card number to be linked in the subscription
     *
     * @param bankCard
     * bank card number to be linked
     */
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    /**
     *
     * Get Subscription start date
     *
     * @return
     * subscription start date
     *
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     *
     * Set the subscription start date
     *
     * @param startDate
     * subscription start date
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
