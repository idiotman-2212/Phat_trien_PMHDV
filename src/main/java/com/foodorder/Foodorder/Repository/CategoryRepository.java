package com.foodorder.Foodorder.Repository;

import com.foodorder.Foodorder.Entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
    // Thêm các phương thức tùy chọn nếu cần
}

