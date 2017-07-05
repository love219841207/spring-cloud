package com.think.cloud.web.home.service;
import static java.util.concurrent.TimeUnit.SECONDS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import feign.Request;
import feign.Retryer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class WebHomeApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebHomeApplication.class, args);
	}
	
	/**
	 * 设置连接、read超时
	 * @return
	 */
	@Bean
	Request.Options feignOptions() {
		return new Request.Options(/**connectTimeoutMillis**/1 * 1000, /** readTimeoutMillis **/1 * 1000);
	}

	/**
	 * 设置retry
	 * @return
	 */
	@Bean
	Retryer feignRetryer() {
		return new Retryer.Default(100, SECONDS.toMillis(1), 1);
	}
}
