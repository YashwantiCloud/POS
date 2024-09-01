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

    @Autowired
    private PersonDao personDao;

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
        // Use HibernateTemplate's findByNamedParam method to query by firstName

        String query = "FROM Person WHERE firstName = :firstName";
        return (List<Person>) hibernateTemplate.findByNamedParam(query, "firstName", firstName);
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        String query = "FROM Person WHERE lastName = :lastName";
        return (List<Person>) hibernateTemplate.findByNamedParam(query, "lastName", lastName);
    }

    @Override
    public List<Person> findByEmail(String email) {
        return hibernateTemplate.execute(session -> {
            return session.createQuery("FROM Person WHERE email = :email", Person.class)
                    .setParameter("email", email)
                    .getResultList();
        });
    }

    @Override
    public List<Person> findByPhoneNumber(String phoneNumber) {
        return hibernateTemplate.execute(session -> {
            return session.createQuery("FROM Person WHERE phoneNumber = :phoneNumber", Person.class)
                    .setParameter("phoneNumber", phoneNumber)
                    .getResultList();
        });
    }

    @Override
    public List<Person> findByCity(String city) {
        return hibernateTemplate.execute(session -> {
            return session.createQuery("FROM Person WHERE city = :city", Person.class)
                    .setParameter("city", city)
                    .getResultList();
        });    }

    @Override
    public List<Person> findByState(String state) {
        return hibernateTemplate.execute(session -> {
            return session.createQuery("FROM Person WHERE state = :state", Person.class)
                    .setParameter("state", state)
                    .getResultList();
        });
    }

    @Override
    public List<Person> findByZip(String zip) {
        return hibernateTemplate.execute(session -> {
            return session.createQuery("FROM Person WHERE zip = :zip", Person.class)
                    .setParameter("zip", zip)
                    .getResultList();
        });
    }

    @Override
    public List<Person> findByCountry(String country) {
        return hibernateTemplate.execute(session -> {
            return session.createQuery("FROM Person WHERE country = :country", Person.class)
                    .setParameter("country", country)
                    .getResultList();
        });
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
        return hibernateTemplate.execute(session ->
                (Long) session.createQuery("SELECT COUNT(p) FROM Person p").uniqueResult()
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

}
