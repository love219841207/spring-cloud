package com.think.cloud.cleuth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class CloudCleuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudCleuthServerApplication.class, args);
	}
}
