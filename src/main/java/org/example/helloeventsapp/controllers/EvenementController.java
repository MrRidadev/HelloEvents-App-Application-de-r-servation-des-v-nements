package org.example.helloeventsapp.controllers;

import org.example.helloeventsapp.models.Categorie;
import org.example.helloeventsapp.models.Evenement;
import org.example.helloeventsapp.services.EvenementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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

    public ResponseEntity<?> ajouter(@RequestBody Evenement evenement) {

        System.out.println("[DEBUG] Catégorie reçue : " + evenement.getCategorie());

        if (evenement.getCategorie() == null) {
            System.out.println("[ERREUR] Catégorie est nulle ou invalide !");
            return ResponseEntity
                    .badRequest()
                    .body("Erreur : la catégorie est invalide ou manquante. Valeurs possibles : " + Arrays.toString(Categorie.values()));
        }

        System.out.println("[INFO] Création de l'événement avec catégorie : " + evenement.getCategorie());
        Evenement savedEvent = evenementService.create(evenement);
        return ResponseEntity.ok(savedEvent);
    }

    @PutMapping("/put")
    public Evenement modification(@RequestBody Evenement evenement) {
        return evenementService.update(evenement);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEvenement(@PathVariable Long id) {
        evenementService.delete(id);
    }

    @GetMapping("/serch/{date}")
    public List<Evenement> findByDate(@PathVariable String date) {
        return evenementService.findByDate(date);
    }

}
