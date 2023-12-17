package com.example.cinema.entities;

import java.io.Serializable;
import java.util.Collection;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Cinema implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private double longtitude;
	private double latitude;
	private double altitude;
	 
	private int nombreSalles;
	@OneToMany(mappedBy="cinema")
	private Collection<Salle> salles;
	@ManyToOne
	private Ville ville;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public int getNombreSalles() {
		return nombreSalles;
	}
	public void setNombreSalles(int nombreSalles) {
		this.nombreSalles = nombreSalles;
	}

	public void setVille(Ville v) {
		// TODO Auto-generated method stub
		
	}


	

}
