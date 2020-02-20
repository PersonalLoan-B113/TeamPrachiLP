package com.webcore.app.loan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BankProjectLoanProcessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankProjectLoanProcessingApplication.class, args);
	}

}
