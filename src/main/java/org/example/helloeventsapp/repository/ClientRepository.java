package org.example.helloeventsapp.repository;

import org.example.helloeventsapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByEmail(String email);

}
