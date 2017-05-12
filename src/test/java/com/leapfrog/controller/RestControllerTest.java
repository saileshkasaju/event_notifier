package com.leapfrog.controller;

import com.leapfrog.model.Event;
import com.leapfrog.model.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;
import org.junit.Test;

/**
 * Created by Edge on 5/12/2017.
 */
public class RestControllerTest {

    @Test(timeout = 3000)
    public void testCreateEvent() {
        RestTemplate restTemplate = new RestTemplate();
        User user = new User();
        user.setId(1);

        Event event = new Event();
        event.setTitle("Main Event");
        event.setAlertDate((java.sql.Date)new Date());
        event.setDestination("office");
        event.setEndDate((java.sql.Date)new Date());
        event.setInvite(true);
        event.setStartDate((java.sql.Date)new Date());
        event.setStatus(true);
        event.setUser(user);
//        restTemplate.put("http://localhost:8080/event.json", event);
        event = restTemplate.postForObject("http://localhost:8080/event.json", event, Event.class);
    }

    @Test(timeout=3000)
    public void testGetEvents() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Event>> eventsResopnse = restTemplate.exchange(
                "http://localhost:8080/events.json", HttpMethod.GET,
                null, new ParameterizedTypeReference<List<Event>>() {
                });
        List<Event> events = eventsResopnse.getBody();

        for (Event event : events) {
            System.out.println("Event title: " + event.getTitle());
        }
    }
}
