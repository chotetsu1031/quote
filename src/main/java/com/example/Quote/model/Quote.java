package com.example.Quote.model;

public class Quote {
	private String message;
	private String author;
	
	public Quote(String message, String author) {
		this.message = message;
		this.author = author;
	}
	public String getMessage() {
		return message;
	}
	public String getAuthor() {
		return author;
	}
}
