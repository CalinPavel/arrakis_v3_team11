package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_email_address", length = 100, nullable = false)
    private String user_email_address;

    public Integer getUserId() {
        return userId;
    }

    public String getUser_email_address() {
        return user_email_address;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUser_email_address(String user_email_address) {
        this.user_email_address = user_email_address;
    }
}
