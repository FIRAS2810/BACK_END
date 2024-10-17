package com.example.demo.Services;

import java.util.List;

import com.example.demo.entities.Animal;
import com.example.demo.entities.Regime;

public interface AnimalService {

	Animal saveAnimal(Animal a);
	Animal updateAnimal(Animal a);
	void deleteAnimal(Animal a);
	void deleteAnimalById(Long id);
	Animal getAnimal(Long id);
	List<Animal> getAllAnimals();

	List<Animal> findByNomAnimal(String nom);
	List<Animal> findByNomAnimalContains(String nom);
	List<Animal> findByNomPrix (String nom, Double prix);
	List<Animal> findByRegime (Regime regime);
	List<Animal> findByRegimeIdRegime(Long id);
	List<Animal> findByOrderByNomAnimalAsc();
	List<Animal> trierAnimalsNomsPrix();
}
