package com.stock.cad.stockapi.domain;

public class Results {
    Quote quote[];

    public Results() {
    }

    public Results(Quote[] quote) {
        this.quote = quote;
    }

    public Quote[] getQuote() {
        return quote;
    }

    public void setQuote(Quote[] quote) {
        this.quote = quote;
    }
}
