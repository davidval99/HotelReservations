package com.proyecto.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.proyecto.example"})
public class PaginaDeHotelesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginaDeHotelesApplication.class, args);
	}

}
