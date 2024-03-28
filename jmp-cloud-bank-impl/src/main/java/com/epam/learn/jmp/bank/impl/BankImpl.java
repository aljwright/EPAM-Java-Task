package com.epam.learn.jmp.bank.impl;


import com.epam.learn.jmp.bank.api.Bank;
import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.BankCardType;
import com.epam.learn.jmp.dto.User;

public class BankImpl implements Bank {


    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {

        BankCard bankCard = BankCardStrategyFactory.getBankCard(bankCardType);
        bankCard.setUser(user);

        return bankCard;
    }
}
