package com.example.cw.service;

import com.example.cw.data.Book;
import com.example.cw.data.BookRepositary;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BookService {
    class BookService {

        @Autowired
        private BookRepositary.BookRepository bookRepository;

        public List<Book> getAllBooks() {
            return bookRepository.findAll();
        }

        public Optional<Book> getBookById(Long id) {
            return bookRepository.findById(id);
        }

        public Book addBook(Book book) {
            return bookRepository.save(book);
        }

        public Book updateBook(Long id, Book bookDetails) {
            Optional<Book> book = bookRepository.findById(id);
            if (book.isPresent()) {
                Book existingBook = book.get();
                existingBook.setTittle(bookDetails.getTitle());
                existingBook.setAuthor(bookDetails.getAuthor());
                existingBook.setIsbn(bookDetails.getIsbn());
                existingBook.setPrice(bookDetails.getPrice());
                return bookRepository.save(existingBook);
            } else {
                return null;
            }
        }

        public void deleteBook(Long id) {
            bookRepository.deleteById(id);
        }
    }

}
