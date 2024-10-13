package com.kazvee.landon_hotel;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LandonHotelApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();
		System.setProperty("spring.application.name", dotenv.get("SPRING_APPLICATION_NAME"));
		System.setProperty("spring.jpa.database", dotenv.get("SPRING_JPA_DATABASE"));
		System.setProperty("spring.datasource.url", dotenv.get("SPRING_DATASOURCE_URL"));
		System.setProperty("spring.datasource.username", dotenv.get("SPRING_DATASOURCE_USERNAME"));
		System.setProperty("spring.datasource.password", dotenv.get("SPRING_DATASOURCE_PASSWORD"));

		SpringApplication.run(LandonHotelApplication.class, args);
	}
}