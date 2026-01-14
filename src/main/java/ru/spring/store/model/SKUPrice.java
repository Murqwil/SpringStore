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
public class SKUPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pricesId;
    private BigDecimal price;
    @Enumerated(value = EnumType.STRING)
    private Local currency;
}
