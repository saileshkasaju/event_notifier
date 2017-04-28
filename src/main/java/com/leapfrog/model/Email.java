package com.leapfrog.model;

/**
 * Created by Edge on 4/28/2017.
 */
public class Email {
    private int id;
    private String email;

    public Email() {
    }

    public Email(int id, String email) {
        this.id = id;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
