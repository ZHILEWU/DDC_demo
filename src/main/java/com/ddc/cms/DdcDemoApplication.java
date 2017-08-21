package com.ddc.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DdcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DdcDemoApplication.class, args);
	}
}
