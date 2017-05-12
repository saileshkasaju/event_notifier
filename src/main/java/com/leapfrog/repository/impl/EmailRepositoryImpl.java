package com.leapfrog.repository.impl;

import com.leapfrog.model.Email;
import com.leapfrog.model.Event;
import com.leapfrog.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edge on 5/10/2017.
 */
@Repository("emailRepository")
public class EmailRepositoryImpl implements EmailRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Email> findAll() {
        List<Email> emails = new ArrayList<>();
        Email email = new Email();
        email.setEmail("test@teset.com");
        emails.add(email);
        return emails;
    }
}
