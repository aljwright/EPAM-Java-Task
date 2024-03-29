package com.epam.learn.jmp.bank.impl;

import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.BankCardType;
import com.epam.learn.jmp.dto.CreditBankCard;
import com.epam.learn.jmp.dto.DebitBankCard;

import java.util.function.Supplier;


public class BankCardStrategyFactory {

    /**
     *
     * Create a new BankCard instance based on the bank card type
     *
     * @param bankCardType to identify the bank card type to be created
     * @return
     * new instance of BankCard
     */
    public static BankCard getBankCard(BankCardType bankCardType){

        return getBankCardSupplier(bankCardType).get();

    }

    /**
     * Create bank card supplier based on bankCard type
     *
     * @param bankCardType identify which type of Bank Card to be created
     * @return
     *
     * Supplier to be used to create Bank Card Object
     *
     */
    private static Supplier<BankCard> getBankCardSupplier(BankCardType bankCardType){
        Supplier<BankCard> bankCardSupplier;
        bankCardSupplier = null;

        switch (bankCardType){

            case CREDIT -> bankCardSupplier = CreditBankCard::new;

            case DEBIT -> bankCardSupplier = DebitBankCard::new;
        }

        return bankCardSupplier;

    }

}
