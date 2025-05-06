package com.freecodecamp2.jpa;

import com.freecodecamp2.jpa.model.Author;
import com.freecodecamp2.jpa.model.Video;
import com.freecodecamp2.jpa.repository.AuthorRepository;
import com.freecodecamp2.jpa.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository,
			VideoRepository videoRepository
	){
		return args -> {
		/*	var author =
					Author
							.builder()
							.firstName("alibou")
							.lastName("alibou")
							.age(34)
							.email("contact@aliboucoding.com")
							.build();
			authorRepository.save(author); */
//			var video =
//					Video.builder()
//							.name("abc")
//							.length(10)
//							.build();
//			videoRepository.save(video);
		};
	}
}
