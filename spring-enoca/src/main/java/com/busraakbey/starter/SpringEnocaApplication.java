package com.busraakbey.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.busraakbey"})

@ComponentScan(basePackages = {"com.busraakbey"})
@EnableJpaRepositories(basePackages = {"com.busraakbey"})
@SpringBootApplication
public class SpringEnocaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEnocaApplication.class, args);
	}

}
