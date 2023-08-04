package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.AppUser;
import com.db.grad.javaapi.model.BookUser;

import java.util.List;

public interface IBookUserService {
    public BookUser saveBookUser(BookUser bookUser);
    public BookUser getBookUserById(Integer BookUserId);
    public List<BookUser> getAllBookUsers();
    public void deleteBookUser(Integer BookUserId);
}
