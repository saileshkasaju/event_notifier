package com.leapfrog.service;

import com.leapfrog.model.Event;

import java.util.List;

/**
 * Created by Edge on 5/1/2017.
 */
public interface EventService {
    Event createEvent(Event event);

    List<Event> findAll();
}
