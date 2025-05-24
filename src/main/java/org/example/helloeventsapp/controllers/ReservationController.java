package org.example.helloeventsapp.controllers;


import org.example.helloeventsapp.models.Reservation;
import org.example.helloeventsapp.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }


    @PostMapping("/ajouter")
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return reservationService.ajouterReservation(reservation);
    }
    @GetMapping("/getAll")
    public List<Reservation> getAllReservations() {
        return reservationService.findAll();
    }

}
