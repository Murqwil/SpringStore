package ru.spring.store.model;

import jakarta.persistence.*;
import lombok.*;
import ru.spring.store.enums.AmountType;
import ru.spring.store.enums.ColorType;
import ru.spring.store.enums.UOM;

@Entity
@Table(name = "ss_sku_package")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SKUPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long skuPackageId;

    private String name;

    @OneToOne
    @JoinColumn(name = "sku_id")
    private SKU skuId;

    @Enumerated(value = EnumType.STRING)
    private UOM uom;

    @Enumerated(value = EnumType.STRING)
    private AmountType amount;

    @Enumerated(value = EnumType.STRING)
    private ColorType colorType;
}
