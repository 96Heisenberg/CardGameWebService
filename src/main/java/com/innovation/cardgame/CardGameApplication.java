package com.innovation.cardgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.innovation"})
public class CardGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardGameApplication.class, args);
	}

}
