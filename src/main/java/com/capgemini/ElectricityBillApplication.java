package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElectricityBillApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricityBillApplication.class, args);
		System.out.println("Bill is Printed");
	}
}
