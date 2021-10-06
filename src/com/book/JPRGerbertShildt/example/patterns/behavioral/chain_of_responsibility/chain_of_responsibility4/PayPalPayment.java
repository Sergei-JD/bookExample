package com.book.JPRGerbertShildt.example.patterns.behavioral.chain_of_responsibility.chain_of_responsibility4;

public class PayPalPayment implements Payment {

    private Payment payment;

    public void setNext(Payment payment) {
        this.payment = payment;
    }

    public void pay() {
        System.out.println("PayPal Payment");
    }

}
