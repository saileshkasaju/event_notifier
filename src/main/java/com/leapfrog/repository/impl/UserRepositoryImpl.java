package com.leapfrog.repository.impl;

import com.leapfrog.model.Event;
import com.leapfrog.model.User;
import com.leapfrog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edge on 5/10/2017.
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setUsername("user");
        users.add(user);
        return users;
    }
}
