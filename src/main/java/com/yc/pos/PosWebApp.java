package com.yc.pos;

import com.yc.pos.config.ApplicationConfig;
import com.yc.pos.config.HibernateConfig;
import com.yc.pos.interfaces.PersonDao;
import com.yc.pos.model.Person;
import com.yc.pos.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class PosWebApp {
    public static void main(String[] args) {
        // Initialize the Spring application context with the required configurations
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class, ApplicationConfig.class);

        // Get the bean using the interface type

        PersonService personService = context.getBean(PersonService.class);

        // Create a new Person instance and set its properties

        Person p = new Person();
        p.setAddress1("Bhivghat");
        p.setCity("Sangli");
        p.setComments("hello");
        p.setEmail("patilranjit485@gmail.com");
        p.setFirstName("Ranjit");
        p.setGender(1);
        p.setState("MH");
        p.setLastName("Patil");
        p.setPersonId(88);
        p.setZip("66666");
        p.setCountry("India");
        p.setPhoneNumber("9999777777");
        p.setAddress2("Hm ghat news news Vita");

        // Use the DAO to save the Person instance
//        personDao.save(p);




    }
}
