package com.eureka.Order_Microservices_Client;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders/{userId}")
    public String getOrderByUser(@PathVariable String userId) {
        return "Order details for User ID: " + userId;
    }
}
