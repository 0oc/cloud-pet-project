package com.pet.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class PetConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetConfigApplication.class, args);
	}
}
