package org.godbles4me.cloud.zookeeper.examples.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringCloudApplication
public class CloudZookeeperExamplesStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZookeeperExamplesStockApplication.class, args);
	}
}
