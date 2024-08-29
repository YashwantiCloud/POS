package com.yc.pos.dao;
/*
* CategoryDaoImpl DAO LAYER Second Layer
*/
import com.yc.pos.interfaces.CategoryDao;
import com.yc.pos.model.Category;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(Category category) {
        hibernateTemplate.save(category);

    }

    @Override
    public void update(Category category) {
        hibernateTemplate.update(category);
    }

    @Override
    public void delete(Long category) {
        hibernateTemplate.delete(category);
    }

    @Override
    public Category findById(Long categoryId) {
        return hibernateTemplate.get(Category.class, categoryId);
    }

    @Override
    public List<Category> findAll() {
        return hibernateTemplate.loadAll(Category.class);
    }
}
