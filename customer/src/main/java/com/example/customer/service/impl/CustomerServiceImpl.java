package com.example.customer.service.impl;

import com.example.customer.model.Customer;
import com.example.customer.repo.CustomerRepo;
import com.example.customer.request.RequestCustomer;
import com.example.customer.request.RequestCustomerValidator;
import com.example.customer.response.ResponseCustomer;
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
    public ResponseCustomer saveCustomer(RequestCustomer requestCustomer) {

        if(RequestCustomerValidator.validate(requestCustomer)) {
            return new ResponseCustomer(
                    "Одно из полей не заполнено пользователь не создан", requestCustomer);
        }

        Customer customer = Customer.builder()
                .email(requestCustomer.getEmail())
                .username(requestCustomer.getUsername())
                .password(requestCustomer.getPassword())
                .build();

        customerRepo.save(customer);

        return new ResponseCustomer("Новый пользователь добавлен", requestCustomer);
    }

    @Override
    @Transactional
    public void deleteCustomer(Long id) {
        customerRepo.deleteById(id);
    }
}
