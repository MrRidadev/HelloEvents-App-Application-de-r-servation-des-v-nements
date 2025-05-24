package org.example.helloeventsapp.controllers;

import org.example.helloeventsapp.models.Client;
import org.example.helloeventsapp.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/All")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable long id) {
        clientService.deleteClient(id);
    }

}
