package ru.spring.store.model;

import jakarta.persistence.*;
import lombok.*;
import ru.spring.store.enums.Currency;
import ru.spring.store.enums.Local;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "ss_sku_price")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SKUPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal price;

    @Enumerated(value = EnumType.STRING)
    private Currency currency;
}
