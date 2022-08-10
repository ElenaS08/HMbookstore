package com.db.bookstore.service;


import com.db.bookstore.model.Book;
import com.db.bookstore.model.User;
import com.db.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> findByTitle() {
        return bookRepository.findAll();
    }
}
