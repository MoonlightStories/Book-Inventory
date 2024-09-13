package com.example.cw.service;


import com.example.cw.data.Book;
import com.example.cw.data.BookRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepositary bookRepository;

    // Retrieve all books
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    // Retrieve a book by ID
    public Book getBookById(Integer id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(null);
    }

    // Create a new book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    // Update an existing book
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    // Delete a book by ID
    public Book deleteBookById(Integer id) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) {
            bookRepository.deleteById(id);
            return book.get(); // Return the deleted book details
        }
        return null;
    }
}
