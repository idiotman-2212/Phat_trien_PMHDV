package com.foodorder.Foodorder.Repository;

import com.foodorder.Foodorder.Entity.DiscountDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountDetailsRepository extends JpaRepository<DiscountDetailsEntity, Integer> {
    // Thêm các phương thức tùy chọn nếu cần
}
