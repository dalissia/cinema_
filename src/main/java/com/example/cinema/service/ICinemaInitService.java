package com.example.cinema.service;

import org.springframework.stereotype.Service;

@Service
public interface ICinemaInitService {
	public void initVilles();
	public void initCinemas();
	public void initSalles();
	public void initPlaces();
	public void initTickets();
	public void initCategories();
	public void initSeances();
	public void initProjections();
	public void initFilms();

}
