package org.godbles4me.cloud.redis.discovery.core;

import org.springframework.cloud.client.serviceregistry.ServiceRegistry;

public class RedisServiceRegistry implements ServiceRegistry<RedisServiceInstance> {


    @Override
    public void register(RedisServiceInstance redisServiceInstance) {

    }

    @Override
    public void deregister(RedisServiceInstance redisServiceInstance) {

    }

    @Override
    public void close() {

    }

    @Override
    public void setStatus(RedisServiceInstance redisServiceInstance, String s) {

    }

    @Override
    public <T> T getStatus(RedisServiceInstance redisServiceInstance) {
        return null;
    }
}
