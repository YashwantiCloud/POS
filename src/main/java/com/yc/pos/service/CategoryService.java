package com.yc.pos.service;

import com.yc.pos.dao.CategoryDaoImpl;
import com.yc.pos.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryDaoImpl categoryDaoImpl;

    public List<Category> getAllCategories() {
        return categoryDaoImpl.findAll();
    }

    public void saveCategory(Category category) {
        categoryDaoImpl.save(category);
    }

//    More methods add deleteById,getCategory,
}
