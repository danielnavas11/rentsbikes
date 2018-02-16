package com.rentsbikes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(basePackageClasses = {
		RentsBikesApplication.class,
		Jsr310JpaConverters.class}
)
@SpringBootApplication
public class RentsBikesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentsBikesApplication.class, args);
	}
}
