package ru.spring.store.service.user;

import ru.spring.store.data.request.CreateUserRequest;

public interface UserService {
    String createUser(CreateUserRequest createUserRequest);
}
