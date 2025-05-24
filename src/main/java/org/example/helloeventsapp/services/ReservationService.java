package org.example.helloeventsapp.services;

import org.example.helloeventsapp.models.Reservation;
import org.example.helloeventsapp.repository.RservationRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private RservationRepostory reservationRepositorye;

    @Autowired
    public ReservationService(RservationRepostory reservationRepositorye) {
        this .reservationRepositorye = reservationRepositorye;
    }

    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepositorye.save(reservation);
    }
    public List<Reservation> findAll(){
        return reservationRepositorye.findAll();
    }
}
