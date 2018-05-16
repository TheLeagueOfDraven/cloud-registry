package org.godbles4me.cloud.zookeeper.examples.order.controller;

import org.godbles4me.cloud.zookeeper.examples.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(path = "place-order")
    public Boolean placeOrder() {
        return orderService.placeOrder();
    }
}
