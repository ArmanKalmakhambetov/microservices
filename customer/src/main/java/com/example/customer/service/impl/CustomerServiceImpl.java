package com.example.customer.service.impl;

import com.example.customer.model.Customer;
import com.example.customer.repo.CustomerRepo;
import com.example.customer.service.abstracts.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    @Override
    @Transactional(readOnly = true)
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Customer getCustomerById(Long id) {
        return customerRepo.getById(id);
    }

    @Override
    @Transactional
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    @Transactional
    public void deleteCustomer(Long id) {
        customerRepo.deleteById(id);
    }
}
