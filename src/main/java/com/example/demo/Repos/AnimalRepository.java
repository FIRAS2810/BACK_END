package com.example.demo.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Animal;
import com.example.demo.entities.Regime;

@RepositoryRestResource(path = "rest")
@CrossOrigin("http://localhost:4200/")
public interface AnimalRepository extends JpaRepository<Animal,Long> {

	List<Animal> findByNomAnimal(String nom);
	List<Animal> findByNomAnimalContains(String nom); 
	
	@Query("select a from Animal a where a.nomAnimal like %:nom and a.prixAnimal > :prix")
	List<Animal> findByNomPrix (@Param("nom")String nom,@Param("prix") Double prix);

	@Query("select a from Animal a where a.regime = ?1")
	List<Animal> findByRegime (Regime regime);
	
	List<Animal> findByRegimeIdRegime(Long id);
	List<Animal> findByOrderByNomAnimalAsc();
	
	@Query("select a from Animal a order by a.nomAnimal ASC, a.prixAnimal DESC")
	List<Animal> trierAnimalssNomsPrix ();
} 
