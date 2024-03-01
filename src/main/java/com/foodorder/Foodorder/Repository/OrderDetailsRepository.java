package com.foodorder.Foodorder.Repository;

import com.foodorder.Foodorder.Entity.OrderDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetailsEntity, Integer> {
    // Thêm các phương thức tùy chọn nếu cần
}
