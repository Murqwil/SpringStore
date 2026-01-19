package ru.spring.store.model;

import jakarta.persistence.*;
import lombok.*;
import ru.spring.store.enums.CommodityType;
import ru.spring.store.enums.DrinkType;
import ru.spring.store.enums.PackageType;
import ru.spring.store.enums.ProductType;

@Entity
@Table(name = "ss_product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private String productName;
    private boolean isAvailable;

    @Enumerated(value = EnumType.STRING)
    private PackageType packageType;

    @OneToOne(mappedBy = "productId", cascade = CascadeType.ALL)
    private SKU skuId;

    @Enumerated(EnumType.STRING)
    private CommodityType commodityType;

    @Column(name = "drink_type")
    @Enumerated(EnumType.STRING)
    private DrinkType drinkType;

    @Column(name = "product_type")
    @Enumerated(EnumType.STRING)
    private ProductType productType;

    //TODO: Вот тут: и падает с ошибкой, т.к это всё же не enum
//    @Enumerated(value = EnumType.STRING)
//    private Category category;
}
