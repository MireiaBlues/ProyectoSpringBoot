package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args);}

	@RequestMapping("/")
	String hellow() { return "Hello World!";}

	@RequestMapping("/hola")
	String holam()
	{
		return "Hola Mundo!";
	}

	@RequestMapping("/mimedicacion")
	String mimedicacion()
	{
		return "¡Tómate las pastillas!";
	}
}
