package com.nology;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Put everything below into a loop, find out the accn ubmer you want
        // do it until no more customers want to user the atm.

        // 1. Get the customer, type in name? type in acc number? someway to identify a user..
        CustomerRepository db = new CustomerRepository();
        Customer customer = db.findCustomerByAccNumber(1234); // TODO: THis account number will need to be ytped in

        // 2. Create an ATM with a customer
	    ATM bristolAtm = new ATM(customer);

        // 3. Say welcome to the user
        System.out.println("Welcome to the ATM services by nology.");

        // 4. Ask the user to input their pin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your pin");
        int customerPin = scanner.nextInt();
        boolean isAuthenticated = bristolAtm.insertPin(customerPin);

        // 5. Show them three options (Withdraw, Deposit, View Balance)
        String option = "Withdraw";

        // 6. Whatever option they select, you should invoke the method on the atm which reflects that


        // 7. Log the user off when they're done


    }
//    ATM
//    view balance
//    change pin - param & meth
//    withdraw money
//
}
