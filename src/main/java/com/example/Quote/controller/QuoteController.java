package com.example.Quote.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Quote.model.Quote;
import com.example.Quote.service.QuoteService;

@RestController
@RequestMapping("/api/quote")
public class QuoteController {
	private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }
    @GetMapping
    public Quote getTodayQuote() {
    	return quoteService.getRandomQuote();
    }
    @PostMapping
    public Quote createQuote(@RequestBody Quote quote) {
    	return quoteService.addQuote(quote);
    }
}
