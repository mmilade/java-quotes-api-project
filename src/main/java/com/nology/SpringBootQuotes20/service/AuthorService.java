package com.nology.SpringBootQuotes20.service;

import com.nology.SpringBootQuotes20.entity.Author;
import com.nology.SpringBootQuotes20.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepo;

    public List<Author> findAll() {
        return authorRepo.findAll();
    }

    public Author createAuthor(Author author) {
        return authorRepo.save(author);
    }

}
