package com.leapfrog.repository;

import com.leapfrog.model.User;

import java.util.List;

/**
 * Created by Edge on 5/1/2017.
 */
public interface UserRepository {
    List<User> findAll();
}
