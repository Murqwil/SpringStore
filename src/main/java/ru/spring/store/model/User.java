package ru.spring.store.model;

import ru.spring.store.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ss_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String name;
    private String lastName;
    @Enumerated(value = EnumType.STRING)
    private Role userRole;
    private String login;
    private String email;
    //TODO: сделать его шифрованным
    private String password;

//    @OneToOne
//    @JoinColumn(name = "user_id")
    private long cartId;

//    @OneToOne
//    @JoinColumn(name = "order_id")
    private long orderId;
}
