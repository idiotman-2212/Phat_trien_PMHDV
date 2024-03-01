package com.foodorder.Foodorder.Service.Imp;

import com.foodorder.Foodorder.Entity.ProductEntity;
import com.foodorder.Foodorder.Repository.ProductRepository;
import com.foodorder.Foodorder.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void updateProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }

    @Override
    public void removeProductById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<ProductEntity> getProductById(int id) {
        return productRepository.findById(id);
    }
}
