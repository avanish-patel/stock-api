package com.stock.cad.stockapi.domain;

public class EquityInfo {
    String longname;
    String shortname;

    public EquityInfo() {
    }

    public EquityInfo(String longname, String shortname) {
        this.longname = longname;
        this.shortname = shortname;
    }

    public String getLongname() {
        return longname;
    }

    public void setLongname(String longname) {
        this.longname = longname;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }
}
