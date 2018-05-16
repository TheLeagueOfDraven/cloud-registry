package org.godbles4me.cloud.redis.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudRedisRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRedisRegistryApplication.class, args);
	}
}
