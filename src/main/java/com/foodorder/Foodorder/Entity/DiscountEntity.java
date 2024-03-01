package com.foodorder.Foodorder.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "discounts")
public class DiscountEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int discountId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateStart;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnd;

    private boolean status;

    private int quantity;

    private String description;

    @OneToMany(mappedBy = "discount")
    private List<DiscountDetailsEntity> discountDetailEntities;
}

