package com.epam.learn.jmp.dto;

import java.time.LocalDate;

public class Subscription {

    String bankCard;

    LocalDate startDate;

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
