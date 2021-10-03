package com.book.JPRGerbertShildt.example.patterns.structural.decorator.decorator3;

public class Runner {

    public static void main(String[] args) {

        PrinterInterface printer1 = new Printer("Привет");
        PrinterInterface printer2 = new LeftBracketDecorator(new Printer("Привет"));
        PrinterInterface printer3 = new LeftBracketDecorator(new RightBracketDecorator(new Printer("Привет")));
        PrinterInterface printer4 = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Привет"))));

        printer1.print();
        System.out.println();
        printer2.print();
        System.out.println();
        printer3.print();
        System.out.println();
        printer4.print();

    }

}
