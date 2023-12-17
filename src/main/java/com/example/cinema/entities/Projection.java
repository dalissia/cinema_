package com.example.cinema.entities;


import java.util.Collection;
import java.util.Date;

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
public class Projection {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private double prix;
	private Date dateProjection;
	@ManyToOne
	private Salle salle;
	@ManyToOne
	private Film film;
	@OneToMany(mappedBy="projection")
	private Collection<Ticket> tickets;
	@ManyToOne
	private Seance seance;

}
