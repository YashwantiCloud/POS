package com.yc.pos.interfaces;

import com.yc.pos.model.Customer;

import java.util.List;

public interface CustomerDao {

    // Create
    void save(Customer customer);

    // Read
    Customer findById(int personId);
    List<Customer> findAll();
    Customer findByAccountNumber(String accountNumber);

    // Update
    void update(Customer customer);

    // Delete
    void deleteById(int personId);
    void delete(Customer customer);

    // Additional Methods
    long count();
    boolean existsById(int personId);
    boolean existsByAccountNumber(String accountNumber);
}
