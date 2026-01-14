package ru.spring.store.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import ru.spring.store.enums.Local;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SKUPrices {
    private long skuId;
    private SKUPrice priceId;
    @Enumerated(value = EnumType.STRING)
    private Local local;
}
