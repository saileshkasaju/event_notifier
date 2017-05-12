package com.leapfrog.service.impl;

import com.leapfrog.model.Event;
import com.leapfrog.repository.EventRepository;
import com.leapfrog.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Edge on 5/1/2017.
 */
@Service("eventService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;

    public EventServiceImpl() {
    }

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Autowired
    public void setEventRepository(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event createEvent(Event event) {
        eventRepository.createEvent(event);
        return null;
    }
    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }
}
