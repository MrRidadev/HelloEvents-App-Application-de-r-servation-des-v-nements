package org.example.helloeventsapp.services;

import jakarta.validation.Valid;
import org.example.helloeventsapp.DTO.AuthResponse;
import org.example.helloeventsapp.DTO.LoginRequest;
import org.example.helloeventsapp.DTO.RegisterRequest;
import org.example.helloeventsapp.config.JwtUtil;
import org.example.helloeventsapp.models.Client;
import org.example.helloeventsapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired private PasswordEncoder passwordEncoder;
    @Autowired private ClientRepository clientRepo;
    @Autowired private JwtUtil jwtUtil;

    public AuthService(PasswordEncoder passwordEncoder, ClientRepository clientRepo, JwtUtil jwtUtil) {
        this.passwordEncoder = passwordEncoder;
        this.clientRepo = clientRepo;
        this.jwtUtil = jwtUtil;
    }

    public AuthResponse register(@Valid RegisterRequest request) {
        if (request.getPassword() == null || request.getPassword().isBlank()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }

        String encodedPassword = passwordEncoder.encode(request.getPassword());

        Client client = new Client();
        client.setEmail(request.getEmail());
        client.setModPass(encodedPassword);
        client.setNom(request.getNom());
        client.setRole(request.getRole());

        clientRepo.save(client);

        String jwt = jwtUtil.generateToken(client.getEmail(), client.getRole());

        return new AuthResponse(jwt);
    }

    public AuthResponse login(LoginRequest req) {
        Client client = clientRepo.findByEmail(req.getEmail());

        if (!passwordEncoder.matches(req.getPassword(), client.getModPass()))
            throw new BadCredentialsException("Wrong password");

        // Utiliser email dans le token comme à l'inscription
        String token = jwtUtil.generateToken(client.getEmail(), client.getRole());
        return new AuthResponse(token);
    }
}
