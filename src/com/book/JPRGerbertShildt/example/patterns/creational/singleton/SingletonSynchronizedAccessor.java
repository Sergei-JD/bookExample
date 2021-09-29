package com.book.JPRGerbertShildt.example.patterns.creational.singleton;

//Synchronized Accessor

/*Плюсы:
    Ленивая инициализация.
    Потокобезопасность

Минусы:
    Низкая производительность в многопоточной среде*/

public class SingletonSynchronizedAccessor {

    private static SingletonSynchronizedAccessor INSTANCE;

    private SingletonSynchronizedAccessor() {
    }

    public static synchronized SingletonSynchronizedAccessor getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonSynchronizedAccessor();
        }
        return INSTANCE;
    }

}
