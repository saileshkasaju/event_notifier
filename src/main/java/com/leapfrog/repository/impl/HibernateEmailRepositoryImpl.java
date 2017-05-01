package com.leapfrog.repository.impl;

import com.leapfrog.model.Email;
import com.leapfrog.repository.EmailRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edge on 4/28/2017.
 */
@Repository("emailRepository")
public class HibernateEmailRepositoryImpl implements EmailRepository {

    @Override
    public List<Email> findAll() {
        List<Email> emails = new ArrayList<>();
        Email email = new Email();

        email.setId(1);
        email.setEmail("leosailesh@gmail.com");

        emails.add(email);
        return emails;
    }
}
