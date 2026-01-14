package ru.spring.store.model;

import jakarta.persistence.*;
import ru.spring.store.enums.Category;
import ru.spring.store.enums.PackageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String productName;
    private boolean isAvailable;
    @Enumerated(value = EnumType.STRING)
    private PackageType packageType;

//    @Enumerated(value = EnumType.STRING)
//    private Category category;
}
