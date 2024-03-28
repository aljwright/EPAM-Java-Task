package com.epam.learn.jmp.bank.impl;

import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.BankCardType;
import com.epam.learn.jmp.dto.CreditBankCard;
import com.epam.learn.jmp.dto.DebitBankCard;

public class BankCardStrategyFactory {

    public static BankCard getBankCard(BankCardType bankCardType){

        BankCard bankCard = null; 

        switch (bankCardType){
            
            case CREDIT -> bankCard = new CreditBankCard();
            
            case DEBIT -> bankCard = new DebitBankCard();
            
        }
        return bankCard;
    }

}
