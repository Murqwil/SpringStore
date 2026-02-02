package ru.spring.store.model.sku;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ss_sku_translation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SKUTranslation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long translationId;
    private String name;
    private String description;
}
