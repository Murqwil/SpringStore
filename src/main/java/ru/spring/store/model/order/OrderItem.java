package ru.spring.store.model.order;

import jakarta.persistence.*;
import lombok.*;
import ru.spring.store.enums.Local;

import java.math.BigDecimal;

@Entity
@Table(name = "ss_order_item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;
    private String skuName;
    private String description;
    private BigDecimal price;

    @Enumerated(value = EnumType.STRING)
    private Local currency;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order orderId;
}
