package com.order.processing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.myclietns")
public class OrderProcessingApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderProcessingApplication.class, args);
    }
}
