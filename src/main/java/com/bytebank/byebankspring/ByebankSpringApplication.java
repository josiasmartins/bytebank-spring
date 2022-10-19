package com.bytebank.byebankspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.bytebank.byebankspring.model.Transferencia;
import com.bytebank.byebankspring.repository.TransferenciaRepository;

@SpringBootApplication
public class ByebankSpringApplication {

	// main: método principal que vai fazer o boot (rodar)
	public static void main(String[] args) {
		SpringApplication.run(ByebankSpringApplication.class, args);
	}

	// @Bean: gerencia todo o ciclo de vida
	@Bean
	CommandLineRunner initDatabase(TransferenciaRepository courseRepository) {
		// funcão lambda
		return args -> {
			// courseRepository.deleteAll();
			courseRepository.findAll();
			System.out.println("ibag: "+courseRepository.findAll());

			// Transferencia c = new Transferencia();
			// c.setValor("121212");
			// c.setDestino("212121");

			// courseRepository.save(c);
		};
	}
	/**
	 *	@Bean
	 *	Um bean é um objeto que é criado, gerenciado e 
	 *	destruído pelo container do spring, o framework é totalmente 
	 *	responsável por este objeto, criando, injetando suas propriedades (Injeção de dependência).
	 */
	@Bean 
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			// @Override: Ele é uma forma de garantir que você está sobrescrevendo um método e não criando um novo
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200");
			}
		};
	}
}
