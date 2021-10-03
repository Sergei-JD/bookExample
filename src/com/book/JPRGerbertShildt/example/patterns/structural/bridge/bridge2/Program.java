package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge2;

abstract class Program {

    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    abstract void developProgram();

}
