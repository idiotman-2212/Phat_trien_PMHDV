package com.foodorder.Foodorder.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "products")
public class ProductEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String name;

    private boolean status;

    @OneToMany(mappedBy = "product")
    private List<ProductPriceEntity> productPriceEntities;

    @OneToMany(mappedBy = "product")
    private List<CategoryDetailsEntity> categoryDetailEntities;

    @OneToMany(mappedBy = "product")
    private List<OrderDetailsEntity> orderDetailEntities;

    @OneToMany(mappedBy = "product")
    private List<DiscountDetailsEntity> discountDetailEntities;
}

