package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.service.BookHandler;
import com.db.grad.javaapi.service.BookUserHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class BookUserController {

    private BookUserHandler bookUserService;

    @Autowired
    public BookUserController(BookUserHandler buh){bookUserService = buh;}

    @GetMapping("/bookusers")
    public List<BookUser> getAllBookUsers() {
        return bookUserService.getAllBookUsers();
    }
}
