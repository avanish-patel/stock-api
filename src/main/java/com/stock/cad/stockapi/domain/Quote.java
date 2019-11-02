package com.stock.cad.stockapi.domain;

public class Quote {

    EquityInfo equityinfo;
    PriceData pricedata;

    public Quote() {
    }

    public Quote(EquityInfo equityinfo, PriceData pricedata) {
        this.equityinfo = equityinfo;
        this.pricedata = pricedata;
    }

    public EquityInfo getEquityinfo() {
        return equityinfo;
    }

    public void setEquityinfo(EquityInfo equityinfo) {
        this.equityinfo = equityinfo;
    }

    public PriceData getPricedata() {
        return pricedata;
    }

    public void setPricedata(PriceData pricedata) {
        this.pricedata = pricedata;
    }
}
