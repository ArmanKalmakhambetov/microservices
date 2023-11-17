package com.example.customer.request;

public class RequestCustomerValidator {
    public static boolean validate(RequestCustomer requestCustomer) {

        return requestCustomer.getUsername().isEmpty()
                || requestCustomer.getPassword().isEmpty()
                || requestCustomer.getEmail().isEmpty();
    }
}
