package com.webcore.app.loan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class LoanProssesingMSProject {

	public static void main(String[] args) {
		SpringApplication.run(LoanProssesingMSProject.class, args);
	}
//	@Bean
//public RestTemplate rt() {
//	RestTemplate rs=new RestTemplate();
//	return rs;
//}
}
