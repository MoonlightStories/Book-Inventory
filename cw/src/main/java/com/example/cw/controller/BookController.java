package com.example.cw.controller;


import com.example.cw.data.Book;
import com.example.cw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // Retrieve all books
    @GetMapping(path = "/books")
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    // Retrieve a book by ID
    @GetMapping(path = "books/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return bookService.getBookById(id);
    }

    // Create a new book
    @PostMapping(path = "/books")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    // Update an existing book
    @PutMapping(path = "/books")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    // Delete a book by ID
    @DeleteMapping(path="/books/{id}")
    public Book deleteBookById(@PathVariable Integer id) {
        return bookService.deleteBookById(id);
    }
}
