package com.db.grad.javaapi.service;

import com.db.grad.javaapi.dto.Bond;
import com.db.grad.javaapi.model.AppUser;
import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.repository.AppUserRepository;
import com.db.grad.javaapi.repository.BookRepository;
import com.db.grad.javaapi.repository.BookUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookHandler implements IBookService{

    private BookRepository bookRepository;

    private final SecurityHandler securityHandler;

    private final BookUserRepository bookUserRepository;
    private final AppUserRepository appUserRepository;

    @Autowired
    public BookHandler(BookRepository bookRepository, SecurityHandler securityHandler, BookUserRepository bookUserRepository, AppUserRepository appUserRepository){
        this.bookRepository= bookRepository;
        this.securityHandler = securityHandler;
        this.bookUserRepository = bookUserRepository;
        this.appUserRepository = appUserRepository;
    }


    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Integer bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteBook(Integer bookId) {
        bookRepository.deleteById(bookId);
    }

    public List<Bond> getMyBooks(String email){
        List <Bond> all = securityHandler.getBond();
        List <Bond> out = new ArrayList<>();

        List <AppUser> allUsers = appUserRepository.findAll();
        AppUser myUser = new AppUser();


        for(AppUser currentUser : allUsers){
            if(currentUser.getUser_email_address().equals(email)){
                myUser.setUser_email_address(currentUser.getUser_email_address());
                myUser.setUserId(currentUser.getUserId());
                System.out.println("User found!");
            }
        }


        List<BookUser> allBookUsers = bookUserRepository.findAll();
        List<Book> allBooks = new ArrayList<>();

        for(BookUser currentBookUser : allBookUsers){
            if(currentBookUser.getUser().getUserId() == myUser.getUserId()){
                allBooks.add(currentBookUser.getBook());
                System.out.println(currentBookUser.getBook().getBookName());
            }
        }

        for (Bond itr : all) {
            for(Book bookCheck : allBooks){
                if(itr.getBookName().equals(bookCheck.getBookName())){
                    out.add(itr);
                }
            }
        }

        if(out.isEmpty())
            return null;

        return out;
    }
}
