package com.stock.cad.stockapi.controller;

import com.mashape.unirest.http.JsonNode;
import com.stock.cad.stockapi.domain.StockData;
import com.stock.cad.stockapi.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stockapi")
public class StockController {

    @Autowired
    private StockService stockService;


    @GetMapping("/v1/stocks/{ticker}")
    public ResponseEntity<StockData> getStockData(@PathVariable("ticker") String ticker) {

        try {
            return new ResponseEntity<> (stockService.getStockData(ticker), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new StockData(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
