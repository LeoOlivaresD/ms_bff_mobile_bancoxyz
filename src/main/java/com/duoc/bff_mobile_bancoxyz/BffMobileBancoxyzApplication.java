package com.duoc.bff_mobile_bancoxyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableFeignClients
public class BffMobileBancoxyzApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffMobileBancoxyzApplication.class, args);
	}

}
