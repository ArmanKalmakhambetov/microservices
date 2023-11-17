package com.example.customer.service.abstracts;

import com.example.customer.model.Customer;
import com.example.customer.request.RequestCustomer;
import com.example.customer.response.ResponseCustomer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);

    ResponseCustomer saveCustomer(RequestCustomer customer);

    void deleteCustomer(Long id);

}
