package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Regime {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idRegime;
	
	private String nomRegime;
	private String descriptionRegime;
	
	@JsonIgnore
	@OneToMany(mappedBy="regime")
	private List<Animal> animaux;
	
	
	public Regime() {
		super();
	}



	public Regime(String nomRegime, String descriptionRegime) {
		super();
		this.nomRegime = nomRegime;
		this.descriptionRegime = descriptionRegime;
	}



	


	public Long getIdRegime() {
		return idRegime;
	}



	public void setIdRegime(Long idRegime) {
		this.idRegime = idRegime;
	}



	public String getNomRegime() {
		return nomRegime;
	}



	public void setNomRegime(String nomRegime) {
		this.nomRegime = nomRegime;
	}



	public String getDescriptionRegime() {
		return descriptionRegime;
	}



	public void setDescriptionRegime(String descriptionRegime) {
		this.descriptionRegime = descriptionRegime;
	}



	public List<Animal> getAnimaux() {
		return animaux;
	}



	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
	
	
	
	
}
