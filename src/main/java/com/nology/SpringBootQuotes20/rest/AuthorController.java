package com.nology.SpringBootQuotes20.rest;

import com.nology.SpringBootQuotes20.entity.Author;
import com.nology.SpringBootQuotes20.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService service;

    @GetMapping
    public ResponseEntity<List<Author>> allAuthors() {
        List<Author> authors = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(authors);
    }

    @PostMapping
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        Author newAuthor = service.createAuthor(author);
        return ResponseEntity.status(HttpStatus.CREATED).body(newAuthor);
    }
}
