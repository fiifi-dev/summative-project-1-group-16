package com.company.summativeproject.controllers;

import org.junit.Test;
import static org.junit.Assert.*;


public class QuoteControllerTest {

    @Test
    public void testGetQuote() {
        // Create an instance of QuoteController
        QuoteController quoteController = new QuoteController();

        // Call the getQuote method
        String quote = String.valueOf(quoteController.getQuote());

        // Assert that the returned quote is not null or empty
        assertNotNull(quote);
        assertFalse(quote.isEmpty());
    }
}