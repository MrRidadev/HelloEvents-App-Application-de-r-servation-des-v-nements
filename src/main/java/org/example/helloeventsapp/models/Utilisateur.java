package org.example.helloeventsapp.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@MappedSuperclass
public abstract class Utilisateur {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private String modPass;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getModPass() {
        return modPass;
    }

    public void setModPass(String modPass) {
        this.modPass = modPass;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
