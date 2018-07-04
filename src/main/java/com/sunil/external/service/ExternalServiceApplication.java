package com.sunil.external.service;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableSwagger2
//@ComponentScan(lazyInit = true, excludeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class))
public class ExternalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalServiceApplication.class, args);
	}
	
	@Bean
    public Docket newsApi() {
		 return new Docket(DocumentationType.SWAGGER_2)
		    	  .apiInfo(getApiInfo())	  
		    	  .select()
			  .apis(RequestHandlerSelectors.basePackage("com.sunil"))
			  .paths(PathSelectors.any())
			  .build();
    }
     
	private ApiInfo getApiInfo() {
	      return new ApiInfo("REST Api Documentation",
		  "REST Api Documentation", 
		  "1.0", 
		  "urn:tos",
		   new Contact("", "", ""), 
		  "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", 
		   new ArrayList<VendorExtension>());
	   }
}
