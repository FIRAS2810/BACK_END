package com.example.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomAnimal", types = { Animal.class })
public interface AnimalProjection {

	public String getNomAnimal();

}
