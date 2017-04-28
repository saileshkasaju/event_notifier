package com.leapfrog.model;

import java.util.Date;

/**
 * Created by Edge on 4/28/2017.
 */
public class EventRegister {
    private int id;
    private Event event;
    private Email email;
    private Date invitedDate;
    private boolean confirm;

    public EventRegister() {
    }

    public EventRegister(int id, Event event, Email email, Date invitedDate, boolean confirm) {
        this.id = id;
        this.event = event;
        this.email = email;
        this.invitedDate = invitedDate;
        this.confirm = confirm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Date getInvitedDate() {
        return invitedDate;
    }

    public void setInvitedDate(Date invitedDate) {
        this.invitedDate = invitedDate;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }
}
