package com.yc.pos;

import com.yc.pos.config.ApplicationConfig;
import com.yc.pos.config.HibernateConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PosWebApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class, ApplicationConfig.class);

    }
}
