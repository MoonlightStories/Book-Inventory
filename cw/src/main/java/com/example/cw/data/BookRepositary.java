package com.example.cw.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepositary extends JpaRepository<Book, Integer> {



}

