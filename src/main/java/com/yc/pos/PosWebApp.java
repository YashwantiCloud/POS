package com.yc.pos;

import com.yc.pos.config.ApplicationConfig;
import com.yc.pos.config.HibernateConfig;
import com.yc.pos.dao.PersonDaoImpl;
import com.yc.pos.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PosWebApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class, ApplicationConfig.class);
        PersonDaoImpl personDaoImpl = context.getBean("personDaoImpl",PersonDaoImpl.class);

        Person p = new Person();
        p.setAddress1("Bhivghat");
        p.setCity("sangli");
        p.setComments("hello");
        p.setEmail("patilranjit485@gmail.com");
        p.setFirstName("ranjit");
        p.setGender(1);
        p.setState("mh");
        p.setLastName("Patil");
        p.setPersonId(88);
        p.setZip("66666");
        p.setCountry("india");
        p.setPhoneNumber("9999777777");
        p.setAddress2("Hm ghat news news vita");

        personDaoImpl.save(p);
    }
}
