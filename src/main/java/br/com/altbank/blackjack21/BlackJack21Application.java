package br.com.altbank.blackjack21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BlackJack21Application {

	public static void main(String[] args) {
		SpringApplication.run(BlackJack21Application.class, args);
	}

}
