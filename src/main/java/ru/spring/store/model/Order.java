package ru.spring.store.model;

import jakarta.persistence.*;
import ru.spring.store.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "ss_order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;
    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;
    private LocalDateTime createdAt;

//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private long userId;
}
