package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "book_user")
public class BookUser {

    @Id
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private AppUser user;

}
