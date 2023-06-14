package com.qsp.Springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.qsp.Springdemo")
@EnableJpaRepositories(basePackages = "com.example.reposistory" )
@EntityScan(basePackages = "com.example.bootdemo.dto")
public class SpringdemoApplication {

	 
	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}

}
