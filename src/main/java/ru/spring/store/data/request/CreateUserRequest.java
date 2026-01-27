package ru.spring.store.data.request;

import ru.spring.store.enums.Role;

public record CreateUserRequest (
        String name,
        String lastName,
        String email,
        String password,
        Role role
) {
}
