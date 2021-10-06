package com.book.JPRGerbertShildt.example.patterns.behavioral.chain_of_responsibility.chain_of_responsibility4;

public interface Payment {

    void setNext(Payment payment);

    void pay();

}
