package com.yc.pos.dao;

import com.yc.pos.interfaces.PersonDao;
import com.yc.pos.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(Person person) {
        hibernateTemplate.save(person);
    }

    @Override
    public Person findById(int personId) {
        return hibernateTemplate.get(Person.class, personId);
    }

    @Override
    public List<Person> findAll() {
        return hibernateTemplate.loadAll(Person.class);
    }

    @Override
    public List<Person> findByFirstName(String firstName) {
        return null;
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        return null;
    }

    @Override
    public List<Person> findByEmail(String email) {
        return null;
    }

    @Override
    public List<Person> findByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public List<Person> findByCity(String city) {
        return null;
    }

    @Override
    public List<Person> findByState(String state) {
        return null;
    }

    @Override
    public List<Person> findByZip(String zip) {
        return null;
    }

    @Override
    public List<Person> findByCountry(String country) {
        return null;
    }


    @Override
    public void update(Person person) {
        hibernateTemplate.update(person);
    }

    @Override
    public void deleteById(int personId) {
        Person person = hibernateTemplate.get(Person.class,personId);
        hibernateTemplate.delete(person);
    }

    @Override
    public void delete(Person person) {
        hibernateTemplate.delete(person);
    }

    @Override
    public void deleteAll() {
        hibernateTemplate.deleteAll(hibernateTemplate.loadAll(Person.class));
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean existsById(int personId) {
        return false;
    }

}
