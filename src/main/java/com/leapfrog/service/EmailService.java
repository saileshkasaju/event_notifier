package com.leapfrog.service;

import com.leapfrog.model.Email;

import java.util.List;

/**
 * Created by Edge on 5/1/2017.
 */
public interface EmailService {
    List<Email> findAll();
}
