package com.foodorder.Foodorder.Repository;

import com.foodorder.Foodorder.Entity.ShippingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends JpaRepository<ShippingEntity, Integer> {
    // Thêm các phương thức tùy chọn nếu cần
}

