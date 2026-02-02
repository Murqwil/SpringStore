package ru.spring.store.model.cart;

import jakarta.persistence.*;
import lombok.*;
import ru.spring.store.model.user.User;
import ru.spring.store.model.sku.SKU;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ss_cart")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @ManyToMany
    @JoinTable(
            name = "cart_items",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "sku_id")
    )
    private Set<SKU> cartItems = new HashSet<>();
}
