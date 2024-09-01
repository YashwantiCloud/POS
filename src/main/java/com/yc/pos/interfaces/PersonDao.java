package com.yc.pos.interfaces;

import com.yc.pos.model.Person;

import java.util.List;

public interface PersonDao {

    // Create
    void save(Person person);
    // Read
    Person findById(int personId);
    List<Person> findAll();
    List<Person> findByFirstName(String firstName);
    List<Person> findByLastName(String lastName);
    List<Person> findByEmail(String email);
    List<Person> findByPhoneNumber(String phoneNumber);
    List<Person> findByCity(String city);
    List<Person> findByState(String state);
    List<Person> findByZip(String zip);
    List<Person> findByCountry(String country);

    // Update
    void update(Person person);

    // Delete
    void deleteById(int personId);
    void delete(Person person);
    void deleteAll();

    // Additional Methods
    long count();
    boolean existsById(int personId);
}
