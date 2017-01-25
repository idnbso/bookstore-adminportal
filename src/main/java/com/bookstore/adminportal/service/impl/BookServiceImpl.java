package com.bookstore.adminportal.service.impl;

import com.bookstore.adminportal.domain.Book;
import com.bookstore.adminportal.repository.BookRepository;
import com.bookstore.adminportal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findOne(Long id) {
        return bookRepository.findOne(id);
    }


}
