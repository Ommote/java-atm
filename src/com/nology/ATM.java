package com.nology;

import java.util.Scanner;

public class ATM {
    private Customer currentCustomer;
    private int pinAttempts = 0;
    private boolean isAuthenticated;

    public ATM(Customer customer) {
        this.currentCustomer = customer;
    }

    public Customer getCurrentCustomer(){
        return currentCustomer;
    }

    public void setCurrentCustomer(Customer customer) {
        this.currentCustomer = customer;
    }

    public boolean getIsAuthenticated() {
        return this.isAuthenticated;
    }

    public boolean insertPin(int pinAttempt) {
        // 1. Check if the pin matches their account
        if (currentCustomer.getPinNumber() == pinAttempt) {
            // 2.1 Yay! correct pin
            this.isAuthenticated = true;
        } else {
            // 2.2 Uh oh! pin was wrong..
            pinAttempts = pinAttempts + 1;
            this.isAuthenticated = false;
        }
        return this.isAuthenticated;
    }

    public boolean withdraw(int amount) {
        // 1. know the balances
        return currentCustomer.withdraw(amount);
    }
}
