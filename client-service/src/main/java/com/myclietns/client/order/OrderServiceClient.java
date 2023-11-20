package com.myclietns.client.order;

import com.myclietns.client.order.dto.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("order-service")
@Component
public interface OrderServiceClient {

    @GetMapping(path = "/api/orders")
    List<OrderDto> getAllOrder();
}
