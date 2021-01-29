package com.popcorn.PopcornsAPI;

import com.popcorn.PopcornsAPI.model.Movie;
import com.popcorn.PopcornsAPI.model.MovieRepository;
import com.popcorn.PopcornsAPI.model.User;
import com.popcorn.PopcornsAPI.model.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;

@SpringBootApplication
public class PopcornsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PopcornsApiApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository, MovieRepository movieRatingsRepository){
		return args -> {
			User apoquinto = new User(
					"Test",
					"pass",
					"Test@gmail.com");
			userRepository.save(apoquinto);
			Timestamp date = new Timestamp(8001, 02, 27, 12, 00, 00, 00);
			Movie apos = new Movie(
					"Apoquinto, la venganza III",
					8001,
					"Apoquinto",
					date,
					date
			);
			movieRatingsRepository.save(apos);
		};
	}

}
