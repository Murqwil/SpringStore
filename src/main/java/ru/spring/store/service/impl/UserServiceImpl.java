package ru.spring.store.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.spring.store.data.request.CreateUserRequest;
import ru.spring.store.model.User;
import ru.spring.store.repository.UserRepository;
import ru.spring.store.service.UserService;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public String createUser(CreateUserRequest createUserRequest) {
        if (userRepository.findByEmail(createUserRequest.email()) != null) {
            return "User already exists";
        }
        User user = User.builder()
                .name(createUserRequest.name())
                .email(createUserRequest.email())
                .userRole(createUserRequest.role())
                .password(createUserRequest.password())
                .lastName(createUserRequest.lastName())
                .build();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User successfully created";
    }
}
