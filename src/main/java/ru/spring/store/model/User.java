package ru.spring.store.model;

import lombok.*;
import ru.spring.store.enums.Local;
import ru.spring.store.enums.Role;
import jakarta.persistence.*;

import java.util.Map;

@Entity
@Table(name = "ss_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String name;
    private String lastName;

    private String email;
    private String login;
    //TODO: сделать его шифрованным
    private String password;

    @Enumerated(value = EnumType.STRING)
    private Role userRole;

    @OneToOne(mappedBy = "userId", cascade = CascadeType.ALL)
    private Cart cartId;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Map<Local,Order> userOrders;
}
