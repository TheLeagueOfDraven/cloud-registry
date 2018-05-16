package org.godbles4me.cloud.zookeeper.examples.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients(value = "org.godbles4me.cloud.zookeeper.examples.order.remote")
@SpringCloudApplication
public class CloudZookeeperExamplesOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZookeeperExamplesOrderApplication.class, args);
	}
}
