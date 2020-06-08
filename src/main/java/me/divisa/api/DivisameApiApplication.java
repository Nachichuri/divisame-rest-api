package me.divisa.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "me.divisa.api.repository")
@SpringBootApplication
public class DivisameApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DivisameApiApplication.class, args);
	}

}
