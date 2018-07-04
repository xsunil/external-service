package com.sunil.external.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
//@ComponentScan(lazyInit = true, excludeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class))
public class ExternalServiceApplication {




	public static void main(String[] args) {
		SpringApplication.run(ExternalServiceApplication.class, args);
	}
}
