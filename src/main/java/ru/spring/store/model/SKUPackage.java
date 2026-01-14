package ru.spring.store.model;

import jakarta.persistence.*;
import ru.spring.store.enums.AmountType;
import ru.spring.store.enums.ColorType;
import ru.spring.store.enums.UOM;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SKUPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long skuPackageId;
    private long skuId;
    private String name;
    @Enumerated(value = EnumType.STRING)
    private UOM uom;
    @Enumerated(value = EnumType.STRING)
    private AmountType amount;
    @Enumerated(value = EnumType.STRING)
    private ColorType colorType;
}
