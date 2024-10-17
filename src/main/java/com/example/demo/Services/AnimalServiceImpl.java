package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repos.AnimalRepository;
import com.example.demo.entities.Animal;
import com.example.demo.entities.Regime;


@Service
public class AnimalServiceImpl implements AnimalService {
	
	@Autowired
	AnimalRepository animalRepository;

	@Override
	public Animal saveAnimal(Animal a) {
		return animalRepository.save(a);
	}

	@Override
	public Animal updateAnimal(Animal a) {
		return animalRepository.save(a);
	}

	@Override
	public void deleteAnimal(Animal a) {
		animalRepository.delete(a);
		
	}

	@Override
	public void deleteAnimalById(Long id) {
		 animalRepository.deleteById(id);
		
	}

	@Override
	public Animal getAnimal(Long id) {
		return animalRepository.findById(id).get();
	}

	@Override
	public List<Animal> getAllAnimals() {
		
		return animalRepository.findAll();
	}

	@Override
	public List<Animal> findByNomAnimal(String nom) {
		
		return animalRepository.findByNomAnimal(nom);
	}

	@Override
	public List<Animal> findByNomAnimalContains(String nom) {
		return animalRepository.findByNomAnimalContains(nom);
	}

	@Override
	public List<Animal> findByNomPrix(String nom, Double prix) {
		return animalRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Animal> findByRegime(Regime regime) {
		return animalRepository.findByRegime(regime);
	}

	@Override
	public List<Animal> findByRegimeIdRegime(Long id) {
		return animalRepository.findByRegimeIdRegime(id);
	}

	@Override
	public List<Animal> findByOrderByNomAnimalAsc() {
		return animalRepository.findByOrderByNomAnimalAsc();
	}

	@Override
	public List<Animal> trierAnimalsNomsPrix() {
		// TODO Auto-generated method stub
		return animalRepository.trierAnimalssNomsPrix();
	}
	
	

}
