package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.AnimalService;
import com.example.demo.entities.Animal;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class AnimalRESTController {
	
	
	@Autowired
    AnimalService animalService;

	@GetMapping("/all")
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

   
    @RequestMapping(value="/getbyid/{id}", method = RequestMethod.GET)
    public Animal getAnimalById(@PathVariable("id") Long id) {
        return animalService.getAnimal(id);
    }

    @RequestMapping(value="/addanim",method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('ADMIN')")
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalService.saveAnimal(animal);
    }

    @RequestMapping(value="/updateanim", method = RequestMethod.PUT)
    public Animal updateAnimal(@RequestBody Animal animal) {
        return animalService.updateAnimal(animal);
    }

    @RequestMapping(value="/delanim/{id}", method = RequestMethod.DELETE)
    public void deleteAnimal(@PathVariable("id") Long id) {
        animalService.deleteAnimalById(id);
    }

    @RequestMapping(value="/animsreg/{idRegime}", method = RequestMethod.GET)
    public List<Animal> getAnimalsByRegimeId(@PathVariable("idRegime") Long idRegime) {
        return animalService.findByRegimeIdRegime(idRegime);
    }
    
    @RequestMapping(value="/animsByName/{nom}",method = RequestMethod.GET)
    public List<Animal> findByNomAnimalContains(@PathVariable("nom") String nom) {
    return animalService.findByNomAnimalContains(nom);
    }
    
}

