package com.example.customer.controller;

import com.example.customer.model.Customer;
import com.example.customer.request.RequestCustomer;
import com.example.customer.response.ResponseCustomer;
import com.example.customer.service.abstracts.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {

    private final CustomerService customerService;

    private static final String CREATE_NEW_CUSTOMER = "/create";
    private  static final String GET_CUSTOMER_BY_ID = "/{id}";
    private static final String DELETE_CUSTOMER_BY_ID = "/{id}";

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
    }

    @GetMapping(GET_CUSTOMER_BY_ID)
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
    }

    // TODO: Добавить валидацию данных
    @PostMapping(CREATE_NEW_CUSTOMER)
    public ResponseEntity<ResponseCustomer> saveCustomer(@RequestBody RequestCustomer requestCustomer) {
        return new ResponseEntity<>(customerService.saveCustomer(requestCustomer), HttpStatus.OK);
    }

    @DeleteMapping(DELETE_CUSTOMER_BY_ID)
    public ResponseEntity<String> deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return new ResponseEntity<>("User with id = " + id + " was deleted", HttpStatus.OK);
    }

}
