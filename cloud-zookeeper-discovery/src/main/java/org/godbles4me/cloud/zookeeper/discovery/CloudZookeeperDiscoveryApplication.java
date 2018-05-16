package org.godbles4me.cloud.zookeeper.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudZookeeperDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZookeeperDiscoveryApplication.class, args);
	}
}
