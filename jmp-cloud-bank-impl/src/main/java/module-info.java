module jmp.cloud.bank.impl {

    requires transitive jmp.bank.api;

    requires jmp.dto;

    uses com.epam.learn.jmp.bank.api.Bank;

    exports com.epam.learn.jmp.bank.impl;

    provides com.epam.learn.jmp.bank.api.Bank with com.epam.learn.jmp.bank.impl.BankImpl;

}