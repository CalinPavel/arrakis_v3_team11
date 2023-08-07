package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book_user")
public class BookUser {

    @EmbeddedId
    private BookUserId id;

    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private AppUser user;

    public BookUserId getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public AppUser getUser() {
        return user;
    }

    public void setId(BookUserId id) {
        this.id = id;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    @Embeddable
    public static class BookUserId implements Serializable {
        @Column(name = "book_id")
        private Long bookId;

        @Column(name = "user_id")
        private Long userId;

        public Long getBookId() {
            return bookId;
        }

        public Long getUserId() {
            return userId;
        }

        public void setBookId(Long bookId) {
            this.bookId = bookId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }
    }

}
