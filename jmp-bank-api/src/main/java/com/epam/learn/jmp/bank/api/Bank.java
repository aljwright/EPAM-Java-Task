package com.epam.learn.jmp.bank.api;

import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.BankCardType;
import com.epam.learn.jmp.dto.User;

import java.util.concurrent.ThreadLocalRandom;

public interface Bank {

    long CARD_NO_GENERATOR_MIN_VALUE = 4000_0000_0000_0000L;

    long CARD_NO_GENERATOR_MAX_VALUE = 9999_9999_9999_9999L;

    /**
     * Generates a random 16 digit sequence to be used as Card Number
     *
     * @return
     * Generated 16 digit Card number
     */
    static String getGeneratedCardNumber(){
        long generated_card_no = ThreadLocalRandom.current().nextLong(CARD_NO_GENERATOR_MIN_VALUE,CARD_NO_GENERATOR_MAX_VALUE);
        return String.valueOf(generated_card_no);
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
    BankCard createBankCard(User user, BankCardType bankCardType);

}
