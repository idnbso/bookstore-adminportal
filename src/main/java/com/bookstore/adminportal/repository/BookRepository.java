package com.bookstore.adminportal.repository;


import com.bookstore.adminportal.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();

    Book findOne(Long id);
}
