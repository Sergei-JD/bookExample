package com.book.JPRGerbertShildt.example.patterns.structural.adapter.adapter4;

public class PBankAdapter extends PBank {

    private ABank abank;

    public PBankAdapter(ABank abank) {
        this.abank = abank;
    }

    public void getBalance() {
        abank.getBalance();
    }

}
