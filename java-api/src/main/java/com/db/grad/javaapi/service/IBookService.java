package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.AppUser;
import com.db.grad.javaapi.model.Book;

import java.util.List;

public interface IBookService {

    public Book saveBook(Book book);
    public Book getBookById(Integer bookId);
    public List<Book> getAllBooks();
    public void deleteBook(Integer userId);

}
