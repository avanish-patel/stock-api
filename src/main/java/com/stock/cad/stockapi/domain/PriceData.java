package com.stock.cad.stockapi.domain;

public class PriceData {
    float changepercent;
    float last;
    String bidmarketidentificationcode;
    float change;
    int tradevolume;
    float prevclose;
    int asksize;
    int tick;
    float high;
    String lasttradedatetime;
    float low;
    float ask;
    int bidsize;
    float bid;
    String lastmarketidentificationcode;
    float open;
    int sharevolume;
    String askmarketidentificationcode;

    public PriceData() {
    }

    public PriceData(float changepercent, float last, String bidmarketidentificationcode, float change, int tradevolume, float prevclose, int asksize, int tick, float high, String lasttradedatetime, float low, float ask, int bidsize, float bid, String lastmarketidentificationcode, float open, int sharevolume, String askmarketidentificationcode) {
        this.changepercent = changepercent;
        this.last = last;
        this.bidmarketidentificationcode = bidmarketidentificationcode;
        this.change = change;
        this.tradevolume = tradevolume;
        this.prevclose = prevclose;
        this.asksize = asksize;
        this.tick = tick;
        this.high = high;
        this.lasttradedatetime = lasttradedatetime;
        this.low = low;
        this.ask = ask;
        this.bidsize = bidsize;
        this.bid = bid;
        this.lastmarketidentificationcode = lastmarketidentificationcode;
        this.open = open;
        this.sharevolume = sharevolume;
        this.askmarketidentificationcode = askmarketidentificationcode;
    }


    public float getChangepercent() {
        return changepercent;
    }

    public void setChangepercent(float changepercent) {
        this.changepercent = changepercent;
    }

    public float getLast() {
        return last;
    }

    public void setLast(float last) {
        this.last = last;
    }

    public String getBidmarketidentificationcode() {
        return bidmarketidentificationcode;
    }

    public void setBidmarketidentificationcode(String bidmarketidentificationcode) {
        this.bidmarketidentificationcode = bidmarketidentificationcode;
    }

    public float getChange() {
        return change;
    }

    public void setChange(float change) {
        this.change = change;
    }

    public int getTradevolume() {
        return tradevolume;
    }

    public void setTradevolume(int tradevolume) {
        this.tradevolume = tradevolume;
    }

    public float getPrevclose() {
        return prevclose;
    }

    public void setPrevclose(float prevclose) {
        this.prevclose = prevclose;
    }

    public int getAsksize() {
        return asksize;
    }

    public void setAsksize(int asksize) {
        this.asksize = asksize;
    }

    public int getTick() {
        return tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public String getLasttradedatetime() {
        return lasttradedatetime;
    }

    public void setLasttradedatetime(String lasttradedatetime) {
        this.lasttradedatetime = lasttradedatetime;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getAsk() {
        return ask;
    }

    public void setAsk(float ask) {
        this.ask = ask;
    }

    public int getBidsize() {
        return bidsize;
    }

    public void setBidsize(int bidsize) {
        this.bidsize = bidsize;
    }

    public float getBid() {
        return bid;
    }

    public void setBid(float bid) {
        this.bid = bid;
    }

    public String getLastmarketidentificationcode() {
        return lastmarketidentificationcode;
    }

    public void setLastmarketidentificationcode(String lastmarketidentificationcode) {
        this.lastmarketidentificationcode = lastmarketidentificationcode;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public int getSharevolume() {
        return sharevolume;
    }

    public void setSharevolume(int sharevolume) {
        this.sharevolume = sharevolume;
    }

    public String getAskmarketidentificationcode() {
        return askmarketidentificationcode;
    }

    public void setAskmarketidentificationcode(String askmarketidentificationcode) {
        this.askmarketidentificationcode = askmarketidentificationcode;
    }
}
