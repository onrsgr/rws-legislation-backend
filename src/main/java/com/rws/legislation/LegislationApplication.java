package com.rws.legislation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class LegislationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegislationApplication.class, args);
		System.out.println("Hello Rws");


	}

}
