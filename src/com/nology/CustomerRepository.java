package com.nology;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    List<Customer> customers = new ArrayList<>();

    public Customer findCustomerByAccNumber(Integer accountNumber) {
        // TODO: find the customer by account number
        return new Customer("Andy","Evans", 1234);
    }

}
