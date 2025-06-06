package org.example.helloeventsapp.repository;

import org.example.helloeventsapp.models.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EvenementRepository extends JpaRepository<Evenement, Long> {

    List<Evenement> findByDate(String date);

}
