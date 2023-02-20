package com.nagarro.em.springazureservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAzureService1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureService1Application.class, args);
		System.out.println("Server is up on 8083 Port!!!");
	}

}
