package com.yc.pos.interfaces;

import com.yc.pos.model.Category;
import com.yc.pos.model.Product;

import java.util.List;

public interface CategoryDao {
    void save(Category category);
    void update(Category category);
    void delete(Long category);
    Category findById(Long categoryId);
    List<Category> findAll();
}
