package com.foodorder.Foodorder.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "shipping")
public class ShippingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shippingId;

    @OneToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order;

    private String shipperName;

    private String status;
}
