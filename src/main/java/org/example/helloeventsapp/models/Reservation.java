package org.example.helloeventsapp.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dateReservation;
    private int nombrePlaces;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Evenement evenement;
}
