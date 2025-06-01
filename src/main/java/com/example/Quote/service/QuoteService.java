package com.example.Quote.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.Quote.model.Quote;

@Service
public class QuoteService {
	private final List<Quote> quotes = List.of(
			new Quote("Stay hungry, tay foolish","Steve Jobs"),
			new Quote("人に譲るということが、礼の第一義である。","左伝"),
			new Quote("自分の短所を短所と知れば、それは短所でなくなる。","荘子"),
			new Quote("幸せは、災いのない生活の永続にある","荀子")
			);
	private final Random random = new Random();
	
	public Quote getRandomQuote() {
		return quotes.get(random.nextInt(quotes.size()));
	}
}
