package com.yc.pos.dao;

import com.yc.pos.interfaces.CustomerDao;
import com.yc.pos.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(Customer customer) {
        hibernateTemplate.save(customer);
    }

    @Override
    public Customer findById(int personId) {
        return hibernateTemplate.get(Customer.class, personId);
    }

    @Override
    public List<Customer> findAll() {
        return hibernateTemplate.loadAll(Customer.class);
    }

    @Override
    public Customer findByAccountNumber(String accountNumber) {
        return hibernateTemplate.get(Customer.class, accountNumber);
    }

    @Override
    public void update(Customer customer) {
        hibernateTemplate.update(customer);
    }

    @Override
    public void deleteById(int personId) {
        Customer customer = hibernateTemplate.get(Customer.class, personId);
        if (customer != null) {
            hibernateTemplate.delete(customer);
        }
    }

    @Override
    public void delete(Customer customer) {
        hibernateTemplate.delete(customer);
    }

    @Override
    public long count() {
        String hql = "select count(*) from Customer";
        return hibernateTemplate.execute(session ->
                (Long) session.createQuery(hql).uniqueResult()
        );
    }

    @Override
    public boolean existsById(int personId) {
        Long count = hibernateTemplate.execute(session ->
                (Long) session.createQuery("SELECT COUNT(p) FROM Person p WHERE p.personId = :personId")
                        .setParameter("personId", personId)
                        .uniqueResult()
        );
    return count != null && count > 0;
    }

    @Override
    public boolean existsByAccountNumber(String accountNumber) {
        Long count = hibernateTemplate.execute(session ->
                (Long) session.createQuery("SELECT COUNT(p) FROM Person p WHERE p.personId = :accountNumber")
                        .setParameter("accountNumber", accountNumber)
                        .uniqueResult()
        );
        return count != null && count > 0;
    }
}
