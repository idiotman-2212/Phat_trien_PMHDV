package com.foodorder.Foodorder.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "order_detail")
public class OrderDetailsEntity implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;

    private BigDecimal price;

    private int quantity;
}
