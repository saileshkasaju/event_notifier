package com.leapfrog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by Edge on 5/10/2017.
 */
@Configuration
public class SpringJDBCConfig {

    @Bean
    public DataSource dataSource () {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/event_notifier");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        System.out.println("DataSource Configured");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        System.out.println("Jdbc Bean Configured");
        return jdbcTemplate;
    }
}
