package org.example.helloeventsapp.services;

import org.example.helloeventsapp.models.Client;
import org.example.helloeventsapp.models.Reservation;
import org.example.helloeventsapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public void deleteClient(long id) {
        clientRepository.deleteById(id);
    }

    public Client updateClients( Client clients) {
        return clientRepository.save(clients);
    }

    public List<Reservation> findByReservation(String nom) {
        return clientRepository.findByReservationByNom(nom);
    }
}
