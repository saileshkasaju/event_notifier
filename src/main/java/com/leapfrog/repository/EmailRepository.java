package com.leapfrog.repository;

import com.leapfrog.model.Email;

import java.util.List;

/**
 * Created by Edge on 4/28/2017.
 */
public interface EmailRepository {
    List<Email> findAll();
}
