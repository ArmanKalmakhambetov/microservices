package com.order.processing.controller;

import com.myclietns.client.order.dto.OrderDto;
import com.order.processing.service.OrderProcessingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class OrderProcessingController {

    public static final String GET_INFORMATION_ABOUT_ORDERS = "/information";

    private final OrderProcessingService orderProcessingService;

    @GetMapping(GET_INFORMATION_ABOUT_ORDERS)
    public ResponseEntity<List<OrderDto>> getInformationAboutAllOrders() {
        return new ResponseEntity<>(orderProcessingService.getInformationAboutAllOrders(), HttpStatus.OK);
    }
}
