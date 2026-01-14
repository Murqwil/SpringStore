package ru.spring.store.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ss_sku")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SKU {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long skuId;
    private String skuName;
    private String description;

    private long productId;
}
