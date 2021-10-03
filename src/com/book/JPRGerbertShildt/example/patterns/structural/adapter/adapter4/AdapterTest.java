package com.book.JPRGerbertShildt.example.patterns.structural.adapter.adapter4;

public class AdapterTest {

    public static void main(String[] args) {

        PBank pBank = new PBank();
        pBank.getBalance();

        PBankAdapter abank = new PBankAdapter(new ABank());
        abank.getBalance();

    }

}
