package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repos.AnimalRepository;
import com.example.demo.entities.Animal;
import com.example.demo.entities.Regime;
@SpringBootTest
class AnimauxApplicationTests {

	@Autowired
	private AnimalRepository animalRepository;
	
	@Test
	public void testfindByNomPrix()
	{
	List<Animal> anims = animalRepository.findByNomPrix("Dakota", 150.0);
	for (Animal a : anims)
	{
	System.out.println(a);
	}
	}
	
	@Test
	public void testfindByRegime()
	{
	Regime reg = new Regime();
	reg.setIdRegime(1L);
	List<Animal> anims = animalRepository.findByRegime(reg);
	for (Animal a : anims)
	{
	System.out.println(a);
	}
	}


}
