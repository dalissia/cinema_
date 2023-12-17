package com.example.cinema.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Ticket {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String nomClient;
private double prix;
@Column(unique=true,nullable=true)
private Integer codePayement;
private boolean reservee;
@ManyToOne
private Place place;
@ManyToOne
private Projection projection;
public void setId(Long id) {
	this.id = id;
}
public void setNomClient(String nomClient) {
	this.nomClient = nomClient;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public void setCodePayement(int codePayement) {
	this.codePayement = codePayement;
}
public void setProjection(Projection projection) {
	this.projection = projection;
}
}
