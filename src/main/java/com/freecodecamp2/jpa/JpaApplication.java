package com.freecodecamp2.jpa;

import com.freecodecamp2.jpa.model.Author;
import com.freecodecamp2.jpa.model.Video;
import com.freecodecamp2.jpa.repository.AuthorRepository;
import com.freecodecamp2.jpa.repository.VideoRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class,
				args);
	}
}


//	@Bean
//	public CommandLineRunner commandLineRunner(
//			AuthorRepository authorRepository,
//			VideoRepository videoRepository
//	){
//		return args -> {
//			for(int i=0 ; i< 50 ; i++){
//				Faker faker = new Faker();
//				var author =
//						Author
//								.builder()
//								.firstName(faker.name().firstName())
//								.lastName(faker.name().lastName())
//								.age(faker.number().numberBetween(18,21))
//								.email("contact" + i + "@aliboucoding.com")
//								.build();
//				authorRepository.save(author);
//			}
////			var video =
////					Video.builder()
////							.name("abc")
////							.length(10)
////							.build();
////			videoRepository.save(video);
//		};
//	}
//}
