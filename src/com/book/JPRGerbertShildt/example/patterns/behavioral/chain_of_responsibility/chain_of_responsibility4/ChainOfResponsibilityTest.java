package com.book.JPRGerbertShildt.example.patterns.behavioral.chain_of_responsibility.chain_of_responsibility4;

public class ChainOfResponsibilityTest {

    public static void main(String[] args) {

        Payment visaPayment = new VisaPayment();
        Payment payPalPayment = new PayPalPayment();

        visaPayment.setNext(payPalPayment);
        visaPayment.pay();

    }

}
