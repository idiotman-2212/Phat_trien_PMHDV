package com.foodorder.Foodorder.Service;

import com.foodorder.Foodorder.Entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductEntity> getAllProducts();
    void updateProduct(ProductEntity productEntity);
    void removeProductById(int id);
    Optional<ProductEntity> getProductById(int id);
}
