package org.godbles4me.cloud.zookeeper.examples.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping(path = "/stock")
public class StockController {

    private AtomicInteger totalStock = new AtomicInteger(100);

    @GetMapping(path = "/decrease/{skuAmount}")
    public Integer decreaseStock(@PathVariable(value = "skuAmount") Integer skuAmount) {
        System.out.println("===================");
        return
                null != skuAmount &&
                        skuAmount.intValue() > 0 &&
                            skuAmount.intValue() <= totalStock.intValue() ?
                                totalStock.addAndGet(-skuAmount) : totalStock.intValue();
    }
}
