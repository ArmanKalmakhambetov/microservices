package com.example.customer.response;

import com.example.customer.model.Customer;
import com.example.customer.request.RequestCustomer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseCustomer {

    private String message;

    private RequestCustomer customer;
}
