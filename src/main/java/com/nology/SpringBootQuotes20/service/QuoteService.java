package com.nology.SpringBootQuotes20.service;

import com.nology.SpringBootQuotes20.entity.Quote;
import com.nology.SpringBootQuotes20.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepo;

    // INDEX method
    public List<Quote> listAll() {
        return quoteRepo.findAll();
    }

    // CREATE method
    public Quote createQuote(Quote newQuote) {
        return quoteRepo.save(newQuote);
    }

    // GET/SHOW route
    public Quote getQuote(int id) {
        return quoteRepo.findById(id).get();
    }

    // UPDATE route
    public Quote updateQuote(int id, Quote quote) {
        Quote toBeUpdatedQuote = quoteRepo.findById(id).get();
        toBeUpdatedQuote.setAuthorName(quote.getAuthorName());
        toBeUpdatedQuote.setQuote(quote.getQuote());
        return quoteRepo.save(toBeUpdatedQuote);
    }

    // DELETE route
    public void deleteQuote(int id) {
        quoteRepo.deleteById(id);
    }
}
