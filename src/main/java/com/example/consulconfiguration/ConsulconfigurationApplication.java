package com.example.consulconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulconfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulconfigurationApplication.class, args);
	}
}
