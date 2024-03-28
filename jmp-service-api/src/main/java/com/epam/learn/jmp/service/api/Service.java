package com.epam.learn.jmp.service.api;

import com.epam.learn.jmp.dto.BankCard;
import com.epam.learn.jmp.dto.Subscription;
import com.epam.learn.jmp.dto.User;

import java.util.List;
import java.util.Optional;

public interface Service {

    void subscribe(BankCard bankCard);

    Optional<Subscription> getSubscriptionByBankCardNumber(String bankCardNumber);

    List<User> getAllUsers();


}
