package com.yc.pos.interfaces;

import com.yc.pos.model.Product;
import java.util.List;

public interface ProductDao {
    void save(Product product);
    void update(Product product);
    void delete(Long productId);
    Product findById(Long productId);
    List<Product> findAll();
}
