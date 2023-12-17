package com.example.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.cinema.entities.Cinema;
import com.example.cinema.entities.Ticket;
@RepositoryRestResource
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
