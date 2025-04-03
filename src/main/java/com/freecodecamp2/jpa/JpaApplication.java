package com.freecodecamp2.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository
	){
		return args -> {
			var author =
					Author
							.builder()
							.firstName("alibou")
							.lastName("alibou")
							.age(34)
							.email("contact@aliboucoding.com")
							.build();
			authorRepository.save(author);
		};
	}
	*/
}
