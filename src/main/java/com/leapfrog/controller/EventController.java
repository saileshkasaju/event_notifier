package com.leapfrog.controller;

import com.leapfrog.model.Event;
import com.leapfrog.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Edge on 5/4/2017.
 */
//@Controller
@RestController
@SessionAttributes("event")
public class EventController {

    private EventService eventService;

    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public List<Event> getEvents() {
        return eventService.findAll();
    }

    @RequestMapping(value = "/event", method = RequestMethod.POST)
    public Event createEvent(@RequestBody Event event) {
        eventService.createEvent(event);
        return null;
    }
//    @RequestMapping(value = "/event", method = RequestMethod.GET)
//    public String displayEventPage(Model model) {
//        Event event = new Event();
//        event.setTitle("Java user group");
//        model.addAttribute("event", event);
//        return "event";
//    }
//
//    @RequestMapping(value = "/event", method = RequestMethod.POST)
//    public String processEvent(@ModelAttribute("event") Event event) {
//        System.out.println(event);
//        return "redirect:index.html";
//    }
}
