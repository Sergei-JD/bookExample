package com.book.JPRGerbertShildt.example.patterns.creational.abstract_factory;

public interface Factory {
    Car createCar(String typeOfCar);
    Tank createOfTank(String typeOfTank);
}
