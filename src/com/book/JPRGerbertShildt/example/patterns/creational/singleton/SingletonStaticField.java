package com.book.JPRGerbertShildt.example.patterns.creational.singleton;

//Static field

/*Плюсы:
    Простая и прозрачная реализация
    Потокобезопасность

Минусы:
    Не ленивая инициализация.*/

public class SingletonStaticField {
    public static final SingletonStaticField INSTANCE = new SingletonStaticField();
}


