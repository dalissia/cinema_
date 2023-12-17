package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.cinema.entities.Categorie;
import com.example.cinema.entities.Cinema;
@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}

