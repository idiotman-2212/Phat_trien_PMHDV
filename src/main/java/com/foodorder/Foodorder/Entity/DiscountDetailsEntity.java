package com.foodorder.Foodorder.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "discount_detail")
public class DiscountDetailsEntity implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "discount_id")
    private DiscountEntity discountEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;
}
