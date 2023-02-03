package com.company.summativeproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quote")
public class QuoteController {

    @GetMapping
    public Quote getQuoteOfTheDay() {
        // logic to retrieve quote of the day from a database or other source
        Quote quote = new Quote();
        quote.setId(1);
        quote.setAuthor("Author Name");
        quote.setQuote("Quote of the day");
        return quote;
    }
}

class Quote {
    private int id;
    private String author;
    private String quote;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}

