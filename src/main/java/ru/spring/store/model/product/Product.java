package ru.spring.store.model.product;

import jakarta.persistence.*;
import lombok.*;
import ru.spring.store.enums.type.CommodityType;
import ru.spring.store.enums.type.DrinkType;
import ru.spring.store.enums.type.PackageType;
import ru.spring.store.enums.type.ProductType;
import ru.spring.store.model.sku.SKU;

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

    //TODO: Вот тут: и падает с ошибкой, т.к это всё же не enum, не понятно, как его представлять в бд
//    @Enumerated(value = EnumType.STRING)
//    private Category category;
}
