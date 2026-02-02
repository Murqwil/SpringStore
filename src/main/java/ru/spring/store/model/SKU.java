package ru.spring.store.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Entity
@Table(name = "ss_sku")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SKU {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long skuId;
    private String skuName;
    private String description;

    @OneToOne(mappedBy = "skuId", cascade = CascadeType.ALL)
    private SKUPackage skuPackageId;

    @ElementCollection
    @CollectionTable(
            name = "ss_sku_prices",
            joinColumns = @JoinColumn(name = "sku_id")
    )
    @MapKeyColumn(name = "locale")
    @MapKeyEnumerated(EnumType.STRING)
    private Map<Locale, SKUPrice> skuPrices = new HashMap<>();

    @ElementCollection
    @CollectionTable(
            name = "ss_sku_translations",
            joinColumns = @JoinColumn(name = "sku_id")
    )
    @MapKeyColumn(name = "local")
    @MapKeyEnumerated(EnumType.STRING)
    private Map<Locale, SKUPrice> translations = new HashMap<>();

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product productId;
}
