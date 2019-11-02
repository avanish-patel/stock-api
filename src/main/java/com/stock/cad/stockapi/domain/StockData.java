package com.stock.cad.stockapi.domain;

import com.stock.cad.stockapi.domain.Results;

public class StockData {
    Results results;


    public StockData() {
    }

    public StockData(Results results) {
        this.results = results;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }
}
