package org.example.helloeventsapp.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AuthResponse {

    private String token;

    public AuthResponse() {
    }

    public AuthResponse(String token) {
        this.token = token;
    }
}
