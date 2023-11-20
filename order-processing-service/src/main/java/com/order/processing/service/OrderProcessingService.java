package com.order.processing.service;

import com.myclietns.client.order.OrderServiceClient;
import com.myclietns.client.order.dto.OrderDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderProcessingService {

    private final OrderServiceClient orderServiceClient;
    public List<OrderDto> getInformationAboutAllOrders() {
       return orderServiceClient.getAllOrder();
    }
}
