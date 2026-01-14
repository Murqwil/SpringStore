package ru.spring.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SKUTranslation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long translationId;
    private String name;
    private String description;
}
