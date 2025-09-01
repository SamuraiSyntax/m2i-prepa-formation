package com.m2i.gestionetudiants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.m2i.gestionetudiants")
public class GestionEtudiantsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionEtudiantsApiApplication.class, args);
	}

}
