package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
