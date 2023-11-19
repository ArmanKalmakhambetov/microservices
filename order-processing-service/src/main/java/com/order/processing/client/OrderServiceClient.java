package com.order.processing.client;

import com.order.processing.client.dto.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("order-service")
public interface OrderServiceClient {

    @GetMapping(path = "/api/orders")
    List<OrderDto> getAllOrder();
}
