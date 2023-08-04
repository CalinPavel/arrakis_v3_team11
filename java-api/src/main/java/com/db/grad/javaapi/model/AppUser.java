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


}
