package com.example.orderservice.service.impl;

import com.example.orderservice.controller.dto.OrderDto;
import com.example.orderservice.model.Order;
import com.example.orderservice.repo.OrderRepo;
import com.example.orderservice.service.abstracts.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepo orderRepo;

    @Override
    @Transactional(readOnly = true)
    public List<OrderDto> getAllOrders() {

        return orderRepo.findAll()
                .stream()
                .map(order -> OrderDto.builder()
                        .customerId(order.getCustomerId())
                        .dateOfCreate(order.getDateOfCreate())
                        .productIds(order.getProductIds())
                        .build())
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public Order getOrderById(Long id) {
        Optional<Order> order = orderRepo.findById(id);

        return order.orElseGet(Order::new);
    }

    @Override
    @Transactional
    public Order saveOrder(Order order) {
        return orderRepo.save(order);
    }

    @Override
    @Transactional
    public void deleteOrder(Long id) {
        orderRepo.deleteById(id);
    }
}
