package org.example.helloeventsapp.models;

import jakarta.persistence.*;

@Entity
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
