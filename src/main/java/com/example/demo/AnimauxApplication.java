package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

import com.example.demo.entities.Animal;
import com.example.demo.entities.Regime;

@SpringBootApplication
@EnableMethodSecurity(prePostEnabled=true)
public class AnimauxApplication implements CommandLineRunner {
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;;

	public static void main(String[] args) {
		SpringApplication.run(AnimauxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Animal.class,Regime.class);
	}
}
