package com.think.cloud.service.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = "com.think.cloud.service.user.mapper")
public class ServiceUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceUserApplication.class, args);
	}
}
