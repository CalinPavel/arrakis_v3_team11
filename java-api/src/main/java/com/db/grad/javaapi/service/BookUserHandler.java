package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.repository.BookRepository;
import com.db.grad.javaapi.repository.BookUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class BookUserHandler implements IBookUserService{

    private BookUserRepository bookUserRepository;

    @Autowired
    public BookUserHandler(BookUserRepository bookUserRepository) {this.bookUserRepository= bookUserRepository;}

    @Override
    public BookUser saveBookUser(BookUser bookUser) {return bookUserRepository.save(bookUser);}

    @Override
    public BookUser getBookUserById(Integer bookUserId) {return bookUserRepository.findById(bookUserId).orElse(null);}

    @Override
    public List<BookUser> getAllBookUsers() {return bookUserRepository.findAll();}

    @Override
    public void deleteBookUser(Integer bookUserID) {bookUserRepository.deleteById(bookUserID);}
}
