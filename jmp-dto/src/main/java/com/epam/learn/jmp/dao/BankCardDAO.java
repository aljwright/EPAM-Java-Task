package com.epam.learn.jmp.dao;

import com.epam.learn.jmp.dto.BankCard;

import java.util.ArrayList;
import java.util.List;

public class BankCardDAO {

    /**
     *
     * Holder for storing the bank Cards
     *
     */
    List<BankCard> bankCards ;

    /**
     * Instantiate BankCardDAO
     */
    public BankCardDAO(){
        bankCards = new ArrayList<>();
    }

    /**
     * Get All BankCards
     *
     * @return
     * List of BankCards
     */
    public List<BankCard> getAllBankCards(){
        return this.bankCards;
    }


    /**
     * Save the Bank Card in memory
     *
     * @param bankCard bank card to be saved in memory
     */
    public void saveBankCard(BankCard bankCard){
        bankCards.add(bankCard);
    }


}
