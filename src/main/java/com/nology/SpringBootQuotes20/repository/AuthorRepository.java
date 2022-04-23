package com.nology.SpringBootQuotes20.repository;

import com.nology.SpringBootQuotes20.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
