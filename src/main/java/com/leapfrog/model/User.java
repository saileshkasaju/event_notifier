package com.leapfrog.model;

/**
 * Created by Edge on 4/28/2017.
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String activationCode;
    private String email;
    private boolean status;

    public User() {
    }

    public User(int id, String username, String password, String activationCode, String email, boolean status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.activationCode = activationCode;
        this.email = email;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
