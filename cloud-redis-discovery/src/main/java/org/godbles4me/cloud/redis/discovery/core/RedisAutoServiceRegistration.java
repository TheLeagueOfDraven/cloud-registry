package org.godbles4me.cloud.redis.discovery.core;

import org.springframework.cloud.client.serviceregistry.AbstractAutoServiceRegistration;
import org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationProperties;
import org.springframework.cloud.client.serviceregistry.ServiceRegistry;

public class RedisAutoServiceRegistration extends AbstractAutoServiceRegistration<RedisServiceInstance> {

    protected RedisAutoServiceRegistration(ServiceRegistry<RedisServiceInstance> serviceRegistry) {
        super(serviceRegistry);
    }

    protected RedisAutoServiceRegistration(ServiceRegistry<RedisServiceInstance> serviceRegistry, AutoServiceRegistrationProperties properties) {
        super(serviceRegistry, properties);
    }

    @Override
    protected RedisServiceInstance getRegistration() {
        return null;
    }

    @Override
    protected RedisServiceInstance getManagementRegistration() {
        return null;
    }

    @Override
    protected int getConfiguredPort() {
        return 0;
    }

    @Override
    protected void setConfiguredPort(int i) {

    }

    @Override
    protected Object getConfiguration() {
        return null;
    }

    @Override
    protected boolean isEnabled() {
        return false;
    }
}
