package ru.spring.store.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.spring.store.enums.Local;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SKUTranslations {
    private long skuId;
    private SKUTranslation translationId;
    @Enumerated(value = EnumType.STRING)
    private Local local;
}
