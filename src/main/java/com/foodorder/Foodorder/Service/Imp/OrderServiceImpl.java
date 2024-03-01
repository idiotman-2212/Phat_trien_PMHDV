package com.foodorder.Foodorder.Service.Imp;

import com.foodorder.Foodorder.Entity.OrderEntity;
import com.foodorder.Foodorder.Repository.OrderRepository;
import com.foodorder.Foodorder.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public void updateOrder(OrderEntity order) {
        orderRepository.save(order);
    }

    @Override
    public void removeOrderById(int id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Optional<OrderEntity> getOrderById(int id) {
        return orderRepository.findById(id);
    }
}
