package org.example.helloeventsapp.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Client extends Utilisateur {

    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations;


}
