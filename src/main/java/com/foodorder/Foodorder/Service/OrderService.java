package com.foodorder.Foodorder.Service;

import com.foodorder.Foodorder.Entity.OrderEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<OrderEntity> getAllOrders();
    void updateOrder(OrderEntity order);
    void removeOrderById(int id);
    Optional<OrderEntity> getOrderById(int id);
}
