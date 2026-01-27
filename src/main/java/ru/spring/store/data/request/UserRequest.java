package ru.spring.store.data.request;

public record UserRequest(
        String email,
        String password
) {
}
