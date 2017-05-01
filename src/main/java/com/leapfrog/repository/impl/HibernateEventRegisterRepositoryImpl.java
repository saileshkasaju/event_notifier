package com.leapfrog.repository.impl;

import com.leapfrog.model.EventRegister;
import com.leapfrog.repository.EventRegisterRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edge on 4/28/2017.
 */
@Repository("eventRegisterRepository")
public class HibernateEventRegisterRepositoryImpl implements EventRegisterRepository {

    @Override
    public List<EventRegister> findAll() {
        List<EventRegister> eventRegisters = new ArrayList<>();
        EventRegister eventRegister = new EventRegister();

        eventRegister.setId(1);

        eventRegisters.add(eventRegister);

        return eventRegisters;
    }
}
