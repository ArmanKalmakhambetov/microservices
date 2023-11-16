package com.example.order.service.impl;

import com.example.order.model.Order;
import com.example.order.repo.OrderRepo;
import com.example.order.service.abstracts.OrderService;
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
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
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
