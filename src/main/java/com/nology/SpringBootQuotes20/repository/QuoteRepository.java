package com.nology.SpringBootQuotes20.repository;

import com.nology.SpringBootQuotes20.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {
}
