package com.example.cinema.entities;

import java.util.Collection;

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
@Data @NoArgsConstructor @AllArgsConstructor
public class Salle {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private int nombrePlace;
@ManyToOne
private Cinema cinema;
@OneToMany(mappedBy="salle")
private Collection<Projection> projections;
@OneToMany(mappedBy="salle")
private Collection<Place> places;


}
