package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Regime;

@RepositoryRestResource(path = "reg")
@CrossOrigin("http://localhost:4200/") 
public interface RegimeRepository extends JpaRepository<Regime,Long> {

}
