package ru.spring.store.service;

import ru.spring.store.model.User;

public interface JWTService {
    String generateToken(User user);
}
