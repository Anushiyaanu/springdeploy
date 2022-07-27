package com.example.springprojdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringprojdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringprojdemoApplication.class, args);
	}
	@GetMapping("/demo")
	public String demo(@RequestParam(value="name",defaultValue = "world!")String name) {
		return String.format("Hello%s",name);
	
	}
}
