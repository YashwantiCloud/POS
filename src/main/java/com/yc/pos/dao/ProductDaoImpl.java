package com.yc.pos.dao;

import com.yc.pos.config.HibernateConfig;
import com.yc.pos.interfaces.ProductDao;
import com.yc.pos.model.Product;
import org.hibernate.SessionFactory;
import org.hibernate.dialect.H2Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(Product product) {
        hibernateTemplate.save(product);
    }

    @Override
    public void update(Product product) {
        hibernateTemplate.update(product);
    }

    @Override
    public void delete(Long productId) {
        Product product =hibernateTemplate.get(Product.class,productId);
        hibernateTemplate.delete(product);
    }

    @Override
    public Product findById(Long productId) {
        return hibernateTemplate.get(Product.class, productId);
    }

    @Override
    public List<Product> findAll() {
        return hibernateTemplate.loadAll(Product.class);
    }
}
