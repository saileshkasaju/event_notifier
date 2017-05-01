package com.leapfrog.repository.impl;

import com.leapfrog.model.Email;
import com.leapfrog.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edge on 4/28/2017.
 */
@Repository("emailRepository")
public class HibernateEmailRepositoryImpl implements EmailRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    @Override
    public List<Email> findAll() {
        System.out.println(dbUsername);
        List<Email> emails = new ArrayList<>();
        Email email = new Email();

        email.setId(1);
        email.setEmail("leosailesh@gmail.com");

        emails.add(email);
        return emails;
    }
}
