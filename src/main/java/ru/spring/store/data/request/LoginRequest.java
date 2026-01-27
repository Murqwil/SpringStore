package ru.spring.store.data.request;

public record LoginRequest (
    String email,
    String password
){
}
