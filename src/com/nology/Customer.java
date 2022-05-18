package com.nology;

public class Customer {
    private String customerLastName;
    private String customerFirstName;
    private String bankName;
    private int pinNumber;
    private double balance;

    public Customer(String firstName, String customerLastName, int pinNumber, double balance) {
        this.customerFirstName = firstName;
        this.customerLastName = customerLastName;
        this.pinNumber = pinNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean withdraw(double amount) {
        // 1. Check the balance to see if there's sufficient funds
        if (this.getBalance() >= amount) {
            // 1.1 We have enough money! yay!
            this.balance = this.balance - amount;
            return true;
        } else {
            // 1.2 We don't have enough money... uh oh!
            return false;
        }
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getBankName() {
        return bankName;
    }

    public int getPinNumber() {
        return pinNumber;
    }
}
