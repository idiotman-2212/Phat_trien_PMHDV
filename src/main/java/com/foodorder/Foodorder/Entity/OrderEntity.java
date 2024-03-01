package com.foodorder.Foodorder.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class OrderEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOrder;

    private boolean statusPay;

    private String statusShipping;

    private BigDecimal total;

    @OneToMany(mappedBy = "order")
    private List<OrderDetailsEntity> orderDetailEntities;

    @OneToOne(mappedBy = "order")
    private PaymentEntity paymentEntity;

    @OneToOne(mappedBy = "order")
    private ShippingEntity shippingEntity;
}
