package com.leapfrog.model;

import java.util.Date;

/**
 * Created by Edge on 4/28/2017.
 */
public class Event {
    private int id;
    private String title;
    private String destination;
    private Date alertDate;
    private Date startDate;
    private Date endDate;
    private boolean invite;
    private boolean status;
    private User user;

    public Event() {
    }

    public Event(int id, String title, String destination, Date alertDate, Date startDate, Date endDate, boolean invite, boolean status, User user) {
        this.id = id;
        this.title = title;
        this.destination = destination;
        this.alertDate = alertDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.invite = invite;
        this.status = status;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getAlertDate() {
        return alertDate;
    }

    public void setAlertDate(Date alertDate) {
        this.alertDate = alertDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isInvite() {
        return invite;
    }

    public void setInvite(boolean invite) {
        this.invite = invite;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
