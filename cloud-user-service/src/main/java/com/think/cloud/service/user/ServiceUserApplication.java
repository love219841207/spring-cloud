package com.think.cloud.service.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = "com.think.cloud.service.user.mapper")
/**
 * config 热部署server。port 连接池初始化无法热部署。采用bus太重。生产使用手动重启
 * @author dongxu
 *
 */
@RefreshScope
public class ServiceUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceUserApplication.class, args);
	}
}
