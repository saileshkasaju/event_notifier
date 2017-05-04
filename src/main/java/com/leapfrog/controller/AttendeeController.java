package com.leapfrog.controller;

import com.leapfrog.model.Attendee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

/**
 * Created by Edge on 5/4/2017.
 */
@Controller
public class AttendeeController {

    @RequestMapping(value = "/attendee", method = RequestMethod.GET)
    public String displayAttendeePage(Model model) {
        Attendee attendee = new Attendee();

        model.addAttribute("attendee", attendee);
        return "attendee";
    }

    @RequestMapping(value = "/attendee", method = RequestMethod.POST)
    public String processAttendee(@Valid Attendee attendee, BindingResult result, Model m) {
        System.out.println(attendee);

        if(result.hasErrors()) {
            return "attendee";
        }

        return "redirect:index.html";
    }
}
