package org.example.helloeventsapp.repository;

import org.example.helloeventsapp.models.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {

}
