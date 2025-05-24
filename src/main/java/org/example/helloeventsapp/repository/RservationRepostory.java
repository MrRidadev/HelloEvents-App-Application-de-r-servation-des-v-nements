package org.example.helloeventsapp.repository;

import org.example.helloeventsapp.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RservationRepostory extends JpaRepository<Reservation, Long> {
}
