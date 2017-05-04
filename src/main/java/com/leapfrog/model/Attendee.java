package com.leapfrog.model;

import com.leapfrog.view.Phone;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Size;

/**
 * Created by Edge on 5/4/2017.
 */
public class Attendee {

    @Size(min = 2, max = 30)
    private String name;

    @NotEmpty @Email
    private String emailAddress;

    @NotEmpty @Phone
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
