package com.invoiceportal.api.dto;

public class AuthDtos {

    public record RegisterRequest(
            String email,
            String fullName,
            String password
    ) {}

    public record LoginRequest(
            String email,
            String password
    ) {}

    public record AuthResponse(
            String token,
            String email,
            String fullName
    ) {}
}