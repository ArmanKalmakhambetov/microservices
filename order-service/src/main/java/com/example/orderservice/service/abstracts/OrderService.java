package com.example.orderservice.service.abstracts;

import com.example.orderservice.controller.dto.OrderDto;
import com.example.orderservice.model.Order;

import java.util.List;

public interface OrderService {

    List<OrderDto> getAllOrders();

    Order getOrderById(Long id);

    Order saveOrder(Order order);

    void deleteOrder(Long id);
}
