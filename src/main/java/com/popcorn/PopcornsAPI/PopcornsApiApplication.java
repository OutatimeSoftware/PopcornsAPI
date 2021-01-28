package com.popcorn.PopcornsAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PopcornsApiApplication {

	private final String message = "Hello World!";

	public PopcornsApiApplication() {}

	public static void main(String[] args) {
		System.out.println(new PopcornsApiApplication().getMessage());
	}

	private final String getMessage() {
		return message;
	}

}
