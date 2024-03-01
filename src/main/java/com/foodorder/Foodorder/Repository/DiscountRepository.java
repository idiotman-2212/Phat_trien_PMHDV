package com.foodorder.Foodorder.Repository;

import com.foodorder.Foodorder.Entity.DiscountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<DiscountEntity, Integer> {
    // Thêm các phương thức tùy chọn nếu cần
}
