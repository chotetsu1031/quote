package com.example.Quote.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.Quote.model.Quote;
import com.example.Quote.repository.QuoteRepository;

@Service
public class QuoteService {
	
	private final QuoteRepository repository;
    public QuoteService(QuoteRepository repository) {
        this.repository = repository;
    }
	public Quote getRandomQuote() {
		List<Quote> quotes = repository.findAll();
		if(quotes.isEmpty()) {
			return new Quote(null, "No quotes available.", "System", null, null);
		}
		return quotes.get(new Random().nextInt(quotes.size()));
	}
	public Quote addQuote(Quote quote) {
		return repository.save(quote);
	}
}
