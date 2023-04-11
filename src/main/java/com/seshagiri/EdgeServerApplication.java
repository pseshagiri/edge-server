package com.seshagiri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EdgeServerApplication {

	public static void main(String[] args) {
		System.out.println("Edge Server Started");
		SpringApplication.run(EdgeServerApplication.class, args);
	}

}
