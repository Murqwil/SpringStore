package ru.spring.store.service;

import ru.spring.store.data.request.CreateUserRequest;
import ru.spring.store.data.request.UserRequest;

public interface UserService {
    String createUser(CreateUserRequest createUserRequest);
}
