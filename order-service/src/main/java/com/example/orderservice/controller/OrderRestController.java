package com.example.orderservice.controller;

import com.example.orderservice.controller.dto.OrderDto;
import com.example.orderservice.model.Order;
import com.example.orderservice.service.abstracts.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orders")
public class OrderRestController {

    private final OrderService orderService;

    private static final String GET_ORDER_BY_ID = "/{id}";
    private static final String DELETE_ORDER_BY_ID = "/{id}";

    @GetMapping
    public ResponseEntity<List<OrderDto>> getAllOrder() {
        return new ResponseEntity<>(orderService.getAllOrders(), HttpStatus.OK);
    }

    @GetMapping(GET_ORDER_BY_ID)
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        return new ResponseEntity<>(orderService.getOrderById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.saveOrder(order), HttpStatus.OK);
    }

    @DeleteMapping(DELETE_ORDER_BY_ID)
    public ResponseEntity<String> deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return new ResponseEntity<>("User with id = " + id + " was deleted", HttpStatus.OK);
    }
}
