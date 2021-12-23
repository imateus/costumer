package br.com.elizabethcarrilho.costumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class CostumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostumerApplication.class, args);
	}

}
