package com.foodorder.Foodorder.Repository;

import com.foodorder.Foodorder.Entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> {
    // Thêm các phương thức tùy chọn nếu cần
}

