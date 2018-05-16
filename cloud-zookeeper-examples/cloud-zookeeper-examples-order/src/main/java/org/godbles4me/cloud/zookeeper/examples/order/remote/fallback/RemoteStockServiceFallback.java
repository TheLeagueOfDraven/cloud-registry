package org.godbles4me.cloud.zookeeper.examples.order.remote.fallback;

import org.godbles4me.cloud.zookeeper.examples.order.remote.RemoteStockService;
import org.springframework.stereotype.Service;

@Service
public class RemoteStockServiceFallback implements RemoteStockService {

    @Override
    public Integer decreaseStock(final Integer skuAmount) {
        return skuAmount;
    }
}
