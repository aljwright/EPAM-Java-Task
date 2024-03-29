package com.epam.learn.jmp.bank.service.client;

import com.epam.learn.jmp.service.api.Service;

import java.util.ServiceLoader;

public class BankServiceClient {


    /**
     *
     * Main method to test Service loader
     * @param args runtime args for main
     */
    public static void main(String[] args) {

        ServiceLoader<Service> services = ServiceLoader.load(Service.class);

        services.forEach(service -> System.out.println(service.getAverageUsersAge()));
    }

}
