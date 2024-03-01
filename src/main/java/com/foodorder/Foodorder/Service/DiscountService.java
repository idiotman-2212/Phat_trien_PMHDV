package com.foodorder.Foodorder.Service;

import com.foodorder.Foodorder.Entity.DiscountEntity;

import java.util.List;
import java.util.Optional;

public interface DiscountService {
    List<DiscountEntity> getAllDiscounts();
    void updateDiscount(DiscountEntity discountEntity);
    void removeDiscountById(int id);
    Optional<DiscountEntity> getDiscountById(int id);
}
