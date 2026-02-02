package ru.spring.store.model.sku;

import jakarta.persistence.*;
import lombok.*;
import ru.spring.store.enums.Local;
import ru.spring.store.model.product.Product;

import java.util.HashMap;
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
    private Map<Local, SKUPrice> skuPrices = new HashMap<>();

    @ElementCollection
    @CollectionTable(
            name = "ss_sku_translations",
            joinColumns = @JoinColumn(name = "sku_id")
    )
    @MapKeyColumn(name = "local")
    @MapKeyEnumerated(EnumType.STRING)
    private Map<Local, SKUPrice> translations = new HashMap<>();

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product productId;
}
