package com.example.cw.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositary {

    interface BookRepository extends JpaRepository<Book, Long> {
    }
}
