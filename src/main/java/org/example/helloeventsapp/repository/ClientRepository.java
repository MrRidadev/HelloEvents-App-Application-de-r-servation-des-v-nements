package org.example.helloeventsapp.repository;

import org.example.helloeventsapp.models.Client;
import org.example.helloeventsapp.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByEmail(String email);

    @Query("SELECT r FROM Reservation r WHERE r.client.nom = :nom")    List<Reservation> findByReservationByNom(@Param("nom") String nom);
}
