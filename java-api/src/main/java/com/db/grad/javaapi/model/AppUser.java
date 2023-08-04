package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    private String user_email_address;

    public int getUser_id() {
        return user_id;
    }

    public String getUser_email_address() {
        return user_email_address;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_email_address(String user_email_address) {
        this.user_email_address = user_email_address;
    }
}
