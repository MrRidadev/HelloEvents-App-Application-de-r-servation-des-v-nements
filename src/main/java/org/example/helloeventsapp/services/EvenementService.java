package org.example.helloeventsapp.services;

import org.example.helloeventsapp.models.Evenement;
import org.example.helloeventsapp.repository.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EvenementService {

    private EvenementRepository repo;

    @Autowired
    public EvenementService(EvenementRepository repo) {
        this.repo = repo;
    }

    public List<Evenement> findAll() {
        return repo.findAll();
    }

    public Evenement create(Evenement e) {
        return repo.save(e);
    }

    public Evenement update(Evenement e) {
        return repo.save(e);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
