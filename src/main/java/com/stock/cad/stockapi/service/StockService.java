package com.stock.cad.stockapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.stock.cad.stockapi.domain.StockData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    ObjectMapper objectMapper;


    public StockData getStockData(String ticker) throws Exception {

        String stockDataString;
        StockData stockData;

        try {
            HttpResponse<String> response = Unirest.get("https://app.quotemedia.com/datatool/getSnapQuotes.json?symbols="+ticker+"&timezone=true&token=097d21d4ae504125d05e1ff9633358948012e5043644b7d156785801addf7767")
                    .header("Origin", "https://web.tmxmoney.com").asString();

            stockDataString = response.getBody();


            stockData = objectMapper.readValue(stockDataString, StockData.class);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        }

        return stockData;

//                .header("cache-control", "no-cache")
//                .header("Postman-Token", "4aa7b6db-f0f7-4bf6-8b81-11a7800155e8").asString();



    }
}
