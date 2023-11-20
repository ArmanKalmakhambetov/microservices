package com.order.processing.controller;

import com.order.processing.client.OrderServiceClient;
import com.order.processing.client.dto.OrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/InformationAboutOrders")
@RequiredArgsConstructor
public class OrderProcessingController {

    private final OrderServiceClient demo;

    @GetMapping
    public ResponseEntity<List<OrderDto>> getInformationAboutOrders() {
        return new ResponseEntity<>(demo.getAllOrder(), HttpStatus.OK);
    }
}
