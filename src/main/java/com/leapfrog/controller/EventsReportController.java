package com.leapfrog.controller;

import com.leapfrog.model.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edge on 5/4/2017.
 */

@RestController
public class EventsReportController {

    @RequestMapping("/events")
    public List<Event> getEvents() {
        List<Event> events = new ArrayList<>();
        Event event1 = new Event();
        event1.setName("Java user group");
        events.add(event1);

        Event event2 = new Event();
        event2.setName("Node user group");
        events.add(event2);

        return events;
    }
}
