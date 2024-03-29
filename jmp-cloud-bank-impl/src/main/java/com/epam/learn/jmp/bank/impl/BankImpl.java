package com.epam.learn.jmp.bank.impl;


import com.epam.learn.jmp.bank.api.Bank;
import com.epam.learn.jmp.dao.BankCardDAO;
import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.BankCardType;
import com.epam.learn.jmp.dto.User;

import java.util.List;


public class BankImpl implements Bank {


    BankCardDAO bankCardDAO;

    public BankImpl(){
        bankCardDAO = new BankCardDAO();
    }

    /**
     * Returns a new BankCard with generated BankCard number and the User attached to it from the request
     *
     * @param user instance to be tied to the BankCard
     * @param bankCardType to identify which type of BankCard to be created.
     * @return
     * a new instance of BankCard with the generated card number
     *
     */
    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {

        BankCard bankCard = BankCardStrategyFactory.getBankCard(bankCardType);

        String generatedCardNo = Bank.getGeneratedCardNumber();

        List<String> existingBankCardNos = bankCardDAO.getAllBankCards().
                stream().
                map(BankCard::getNumber).
                toList();

        while(existingBankCardNos.contains(generatedCardNo)){
            generatedCardNo = Bank.getGeneratedCardNumber();
        }

        bankCard.setNumber(generatedCardNo);
        bankCard.setUser(user);
        bankCardDAO.saveBankCard(bankCard);

        return bankCard;
    }


}
