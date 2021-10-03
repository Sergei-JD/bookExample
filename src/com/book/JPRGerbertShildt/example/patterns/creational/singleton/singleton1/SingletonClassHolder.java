package com.book.JPRGerbertShildt.example.patterns.creational.singleton.singleton1;

//Class Holder Singleton

/*Плюсы:
    Ленивая инициализация.
    Потокобезопасность.
    Высокая производительность в многопоточной среде.

Минусы:
    Для корректной работы необходима гарантия, что объект класса Singleton инициализируется без ошибок.
        Иначе первый вызов метода getInstance закончится ошибкой ExceptionInInitializerError,
        а все последующие NoClassDefFoundError.*/

public class SingletonClassHolder {

    private SingletonClassHolder() {
    }

    private static class SingletonHolder {
        public static final SingletonClassHolder HOLDER_INSTANCE = new SingletonClassHolder();
    }

    public static SingletonClassHolder getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

}
