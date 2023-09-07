package com.smwajahat.adil.orderservice.controller;

import com.smwajahat.adil.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Syed Muhammad Wajahat
 * Creation date: 07/09/2023
 */

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @PostMapping
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        return "Order placed successfully!";
    }
}
