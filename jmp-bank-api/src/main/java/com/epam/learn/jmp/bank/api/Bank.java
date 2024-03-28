package com.epam.learn.jmp.bank.api;

import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.BankCardType;
import com.epam.learn.jmp.dto.User;

public interface Bank {

    BankCard createBankCard(User user, BankCardType bankCardType);

}
