package com.load.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoadAzureApplication {
	@GetMapping("/message")
	public String string(){
		return "Hello, you've created a rest api";
	}
	public static void main(String[] args) {
		SpringApplication.run(LoadAzureApplication.class, args);
	}

}
