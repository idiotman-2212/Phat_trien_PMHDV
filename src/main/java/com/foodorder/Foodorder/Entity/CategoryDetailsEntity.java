package com.foodorder.Foodorder.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "category_detail")
public class CategoryDetailsEntity implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity categoryEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;
}
