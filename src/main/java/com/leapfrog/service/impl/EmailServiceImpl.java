package com.leapfrog.service.impl;

import com.leapfrog.model.Email;
import com.leapfrog.repository.EmailRepository;
import com.leapfrog.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Edge on 5/1/2017.
 */
@Service("emailService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class EmailServiceImpl implements EmailService {
    private EmailRepository emailRepository;

    public EmailServiceImpl() {
    }

    public EmailServiceImpl(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @Autowired
    public void setEmailRepository(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @Override
    public List<Email> findAll() {
        return emailRepository.findAll();
    }
}
