package com.leapfrog;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Edge on 4/28/2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan({"com.leapfrog"})
//@PropertySource("app.properties")
public class AppConfig {
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
}
