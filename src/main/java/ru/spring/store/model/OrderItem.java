package ru.spring.store.model;

import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;
import java.util.Locale;

@Entity
@Table(name = "ss_order_item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;
    private String skuName;
    private String description;
    private BigDecimal price;

    @Enumerated(value = EnumType.STRING)
    private Locale currency;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order orderId;
}
