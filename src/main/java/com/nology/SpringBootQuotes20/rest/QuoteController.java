package com.nology.SpringBootQuotes20.rest;

import com.nology.SpringBootQuotes20.entity.Quote;
import com.nology.SpringBootQuotes20.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/quotes")
public class QuoteController {

    @Autowired
    private QuoteService service;

    // INDEX route
    @GetMapping
    public ResponseEntity<List<Quote>> allQuotes() {
        List<Quote> quotes = service.listAll();
        return ResponseEntity.status(HttpStatus.OK).body(quotes);
    }

    // CREATE route
    @PostMapping
    public ResponseEntity<Quote> createQuote(@RequestBody Quote newQuote) {
        Quote createdQuote = service.createQuote(newQuote);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdQuote);
    }

    // GET/SHOW route
    @GetMapping("/{id}")
    public ResponseEntity<Quote> getQuote(@PathVariable int id) {
        Quote quote = service.getQuote(id);
        return ResponseEntity.status(HttpStatus.OK).body(quote);
    }

    // UPDATE route
    @PutMapping("/{id}")
    public ResponseEntity<Quote> updateQuote(@PathVariable int id, @RequestBody Quote quote) {
        Quote toBeUpdatedQuote = service.updateQuote(id, quote);
        return ResponseEntity.status(HttpStatus.OK).body(toBeUpdatedQuote);
    }

    // DELETE route
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteQuote(@PathVariable int id) {
        service.deleteQuote(id);
        return ResponseEntity.status(HttpStatus.OK).body("Quote with id: " + id + " has been deleted. ");
    }

}
