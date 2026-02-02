package ru.spring.store.service.jwt;

import ru.spring.store.model.user.User;

public interface JWTService {
    String generateToken(User user);
}
