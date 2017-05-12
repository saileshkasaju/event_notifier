package com.leapfrog.repository.impl;

import com.leapfrog.model.Event;
import com.leapfrog.model.EventRegister;
import com.leapfrog.repository.EventRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edge on 5/10/2017.
 */
@Repository("eventRegisterRepository")
public class EventRegisterRepositoryImpl implements EventRegisterRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<EventRegister> findAll() {
        List<EventRegister> eventRegisters = new ArrayList<>();
        EventRegister event = new EventRegister();
        event.setId(1);
        eventRegisters.add(event);
        return eventRegisters;
    }
}
