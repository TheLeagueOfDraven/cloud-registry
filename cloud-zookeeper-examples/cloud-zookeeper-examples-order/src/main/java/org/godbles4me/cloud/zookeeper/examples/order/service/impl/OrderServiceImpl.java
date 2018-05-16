package org.godbles4me.cloud.zookeeper.examples.order.service.impl;

import org.godbles4me.cloud.zookeeper.examples.order.remote.RemoteStockService;
import org.godbles4me.cloud.zookeeper.examples.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {


    @Autowired
    private RemoteStockService remoteStockService;


    @Override
    public Boolean placeOrder() {
        return remoteStockService.decreaseStock(Integer.valueOf(1)) > 0;
    }
}
