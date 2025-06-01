package com.example.Quote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Quote.model.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

}
