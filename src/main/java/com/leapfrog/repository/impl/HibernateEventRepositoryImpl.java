package com.leapfrog.repository.impl;

import com.leapfrog.model.Event;
import com.leapfrog.repository.EventRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edge on 4/28/2017.
 */
@Repository("eventRepository")
public class HibernateEventRepositoryImpl implements EventRepository {

    @Override
    public List<Event> findAll() {
        List<Event> events = new ArrayList<>();
        Event event = new Event();

//        event.setId(1);

        events.add(event);

        return events;
    }
}
