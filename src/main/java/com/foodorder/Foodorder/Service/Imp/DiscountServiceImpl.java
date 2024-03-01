package com.foodorder.Foodorder.Service.Imp;

import com.foodorder.Foodorder.Entity.DiscountEntity;
import com.foodorder.Foodorder.Repository.DiscountRepository;
import com.foodorder.Foodorder.Service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    private DiscountRepository discountRepository;
    @Override
    public List<DiscountEntity> getAllDiscounts() {
        return discountRepository.findAll();
    }

    @Override
    public void updateDiscount(DiscountEntity discountEntity) {
        discountRepository.save(discountEntity);
    }

    @Override
    public void removeDiscountById(int id) {
        discountRepository.deleteById(id);
    }

    @Override
    public Optional<DiscountEntity> getDiscountById(int id) {
        return discountRepository.findById(id);
    }
}
