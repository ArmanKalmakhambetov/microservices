package com.order.processing.client.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class OrderDto {

    private Long customerId;
    private List<Long> productIds;
    private LocalDateTime dateOfCreate;
}
