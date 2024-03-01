package com.foodorder.Foodorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.foodorder.Foodorder.Entity")
public class FoodOrderApplication {
	public static void main(String[] args) {
		SpringApplication.run(FoodOrderApplication.class, args);
	}
}
