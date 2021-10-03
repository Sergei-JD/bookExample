package com.book.JPRGerbertShildt.example.patterns.creational.singleton.singleton1;

//Simple Solution

/*Плюсы:
    Простота и прозрачность кода
    Потокобезопасность
    Высокая производительность в многопоточной среде

Минусы:
    Не ленивая инициализация.*/

public class SingletonSimpleSolution {

    private static final SingletonSimpleSolution INSTANCE = new SingletonSimpleSolution();

    private SingletonSimpleSolution() {
    }

    public static SingletonSimpleSolution getInstance() {
        return INSTANCE;
    }

}
