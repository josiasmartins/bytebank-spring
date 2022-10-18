package com.bytebank.byebankspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bytebank.byebankspring.model.Course;
import com.bytebank.byebankspring.repository.CourseRepository;

@SpringBootApplication
public class ByebankSpringApplication {

	// main: método principal que vai fazer o boot (rodar)
	public static void main(String[] args) {
		SpringApplication.run(ByebankSpringApplication.class, args);
	}

	// @Bean: gerencia todo o ciclo de vida
	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		// funcão lambda
		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setValor("121212");
			c.setDestino("212121");

			courseRepository.save(c);
		};
	}

}
