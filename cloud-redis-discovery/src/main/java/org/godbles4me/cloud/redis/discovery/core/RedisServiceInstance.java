package org.godbles4me.cloud.redis.discovery.core;

import org.springframework.cloud.client.serviceregistry.Registration;

import java.net.URI;
import java.util.Map;

public class RedisServiceInstance implements Registration {

    /**
     * 获取服务ID
     *
     * {@linkplain ##spring.application.name}
     *
     * @return
     */
    @Override
    public String getServiceId() {
        return null;
    }

    @Override
    public String getHost() {
        return null;
    }

    @Override
    public int getPort() {
        return 0;
    }

    @Override
    public boolean isSecure() {
        return false;
    }

    @Override
    public URI getUri() {
        return null;
    }

    @Override
    public Map<String, String> getMetadata() {
        return null;
    }
}
