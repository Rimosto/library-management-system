package com.example.librarymanagement.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String genre;
    private boolean availability;

    // Getters and Setters

    
}
