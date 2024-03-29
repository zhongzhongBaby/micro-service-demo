package com.example.microservicesimpleprovideruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

@EnableEurekaClient //可被服务发现组件发现
@SpringBootApplication
public class MicroServiceSimpleProviderUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroServiceSimpleProviderUserApplication.class, args);
	}
}
