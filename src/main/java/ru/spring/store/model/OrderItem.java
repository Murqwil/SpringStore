package ru.spring.store.model;

import jakarta.persistence.*;
import ru.spring.store.enums.Local;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
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
    private Local currency;

    private long orderId;
}
