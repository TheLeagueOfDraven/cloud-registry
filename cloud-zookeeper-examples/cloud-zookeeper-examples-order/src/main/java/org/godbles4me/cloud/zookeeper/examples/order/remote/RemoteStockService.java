package org.godbles4me.cloud.zookeeper.examples.order.remote;

import org.godbles4me.cloud.zookeeper.examples.order.remote.fallback.RemoteStockServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cloud-zookeeper-examples-stock", fallback = RemoteStockServiceFallback.class)
public interface RemoteStockService {

    @RequestMapping(path = "/stock/decrease/{skuAmount}", method = RequestMethod.GET)
    Integer decreaseStock(@PathVariable(value = "skuAmount") Integer skuAmount);
}
