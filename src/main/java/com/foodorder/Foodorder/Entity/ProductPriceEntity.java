package com.foodorder.Foodorder.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "product_price")
public class ProductPriceEntity implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;

    private Date date;

    private BigDecimal price;

    private String userChanger;
}
