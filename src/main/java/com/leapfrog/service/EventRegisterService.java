package com.leapfrog.service;

import com.leapfrog.model.EventRegister;

import java.util.List;

/**
 * Created by Edge on 5/1/2017.
 */
public interface EventRegisterService {
    List<EventRegister> findAll();
}
