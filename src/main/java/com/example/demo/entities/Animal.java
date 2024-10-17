package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Animal {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long idAnimal;

private String nomAnimal;
private Double prixAnimal;
private Date DateNaissance;

@ManyToOne
private Regime regime; 


public Animal() {
	super();
}


public Animal(String nomAnimal, Double prixAnimal, Date dateNaissance) {

	super(); 
	this.nomAnimal = nomAnimal;
	this.prixAnimal = prixAnimal;
	DateNaissance = dateNaissance;
}


public Long getIdAnimal() {
	return idAnimal;
}
public void setIdAnimal(Long idAnimal) {
	this.idAnimal = idAnimal;
}
public String getNomAnimal() {
	return nomAnimal;
}
public void setNomAnimal(String nomAnimal) {
	this.nomAnimal = nomAnimal;
}
public Double getPrixAnimal() {
	return prixAnimal;
}
public void setPrixAnimal(Double prixAnimal) {
	this.prixAnimal = prixAnimal;
}
public Date getDateNaissance() {
	return DateNaissance;
}
public void setDateNaissance(Date dateNaissance) {
	DateNaissance = dateNaissance;
}


public Regime getRegime() {
	return regime;
}


public void setRegime(Regime regime) {
	this.regime = regime;
}



}
