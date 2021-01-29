package com.popcorn.PopcornsAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class PopcornsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PopcornsApiApplication.class, args);
	}

	@GetMapping("/")
	public String index(
			Model model
	) {

		model.addAttribute("name", "Jorge");

		return "index";
	}


}
