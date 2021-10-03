package com.book.JPRGerbertShildt.example.patterns.creational.singleton.singleton1;

//Lazy Initialization

/*Плюсы:
    Ленивая инициализация.

Минусы:
    Не потокобезопасно
    Реализация интересна. Мы можем инициализироваться лениво, но утратили потокобезопасность.*/

public class SingletonLazyInitialization {

    private static SingletonLazyInitialization INSTANCE;

    private SingletonLazyInitialization() {}

    public static SingletonLazyInitialization getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new SingletonLazyInitialization();
        }
        return INSTANCE;
    }

}
