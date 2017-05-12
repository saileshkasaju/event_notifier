package com.leapfrog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Edge on 4/28/2017.
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.register(SpringJDBCConfig.class);
//        applicationContext.register(SecurityConfig.class);
    }
}
