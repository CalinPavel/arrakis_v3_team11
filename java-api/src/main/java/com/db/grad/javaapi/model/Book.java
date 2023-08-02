package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "book_name", length = 50, nullable = false)
    private String bookName;



}
