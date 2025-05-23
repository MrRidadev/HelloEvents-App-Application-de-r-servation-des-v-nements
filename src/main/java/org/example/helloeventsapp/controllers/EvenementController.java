package org.example.helloeventsapp.controllers;

import org.example.helloeventsapp.models.Evenement;
import org.example.helloeventsapp.services.EvenementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/evenement")
public class EvenementController {

    private EvenementService evenementService;

    public EvenementController(EvenementService evenementService) {
        this.evenementService = evenementService;
    }

    @GetMapping("/get")
    public List<Evenement> getEvenements() {
        return evenementService.findAll();
    }

    @PostMapping("/create")
    public Evenement ajouter(Evenement evenement) {
        return evenementService.create(evenement);
    }
}
