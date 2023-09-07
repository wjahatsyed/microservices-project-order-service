package com.smwajahat.adil.orderservice.service;

import com.smwajahat.adil.orderservice.dto.OrderLineItemsDto;
import com.smwajahat.adil.orderservice.dto.OrderRequest;
import com.smwajahat.adil.orderservice.model.Order;
import com.smwajahat.adil.orderservice.model.OrderLineItems;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/**
 * @author Syed Muhammad Wajahat
 * Creation date: 07/09/2023
 */
@Service
public class OrderService {
    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderLineItems> orderLineItems = order.getOrderLineItemsList()
                .stream()
                .map(this::mapToDto)
                .toList();

    }

    private OrderLineItems mapToDto(OrderLineItems orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;


    }
}
