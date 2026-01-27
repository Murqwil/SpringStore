package ru.spring.store.data.response;

public record JWTResponse(
        String token
) {
    public JWTResponse (String token){
        this.token = token;
    }
}
