package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.dto.Bond;
import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.repository.SecurityRepository;
import com.db.grad.javaapi.service.BookHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class BooksController {

    private BookHandler bookService;

    @Autowired
    public BooksController(BookHandler bh){bookService = bh;}

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }


    @GetMapping("/books/mybooks" )
    public List<Bond> getMyBooks(@RequestHeader("Authorization") String authorizationHeader){

        if (authorizationHeader != null && authorizationHeader.startsWith("Basic ")) {
            String base64Credentials = authorizationHeader.substring("Basic ".length()).trim();
            String credentials = new String(Base64.getDecoder().decode(base64Credentials));

            String[] usernamePassword = credentials.split(":");
            String email = usernamePassword[0];
            String password = usernamePassword[1];

            System.out.println("Email + token");

            return bookService.getMyBooks(email);
        }
        return null;

    }

}
