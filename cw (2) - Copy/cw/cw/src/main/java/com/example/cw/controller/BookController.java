package com.example.cw.controller;


import com.example.cw.data.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class BookController {
    @RestController
    @RequestMapping("/books")
    class BookController {

        @Autowired
        private BookService bookService;

        @GetMapping
        public List<Book> getAllBooks() {
            return bookService.getAllBooks();
        }

        @GetMapping("/{id}")
        public Optional<Book> getBookById(@PathVariable Long id) {
            return bookService.getBookId(id);
        }

        @PostMapping
        public Book addBook(@RequestBody Book book) {
            return bookService.addBook(book);
        }

        @PutMapping("/{id}")
        public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
            return bookService.updateBook(id, bookDetails);
        }

        @DeleteMapping("/{id}")
        public void deleteBook(@PathVariable Long id) {
            bookService.deleteBook(id);
        }
    }


}
