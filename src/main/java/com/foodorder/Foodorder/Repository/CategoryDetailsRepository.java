package com.foodorder.Foodorder.Repository;

import com.foodorder.Foodorder.Entity.CategoryDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDetailsRepository extends JpaRepository<CategoryDetailsEntity, Integer> {
    // Thêm các phương thức tùy chọn nếu cần
}

