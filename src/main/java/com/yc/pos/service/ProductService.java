package com.yc.pos.service;

import com.yc.pos.dao.ProductDaoImpl;
import com.yc.pos.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDaoImpl productDaoImpl;

    public List<Product> getAllProducts() {
        return productDaoImpl.findAll();
    }

    public void saveProduct(Product product) {
        productDaoImpl.save(product);
    }


    // Other business methods
}
