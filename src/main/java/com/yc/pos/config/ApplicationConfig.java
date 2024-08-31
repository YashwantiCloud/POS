package com.yc.pos.config;

import com.yc.pos.dao.PersonDaoImpl;
import com.yc.pos.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.yc.pos")
public class ApplicationConfig {

    @Bean
    public Person person() {
        return new Person();
    }

    @Bean
    public PersonDaoImpl personDaoImpl() {
        return new PersonDaoImpl();
    }

}
