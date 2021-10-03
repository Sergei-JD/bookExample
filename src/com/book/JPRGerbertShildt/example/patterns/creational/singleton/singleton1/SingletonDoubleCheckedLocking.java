package com.book.JPRGerbertShildt.example.patterns.creational.singleton.singleton1;

//Double Checked Locking

/*Плюсы:
    Ленивая инициализация.
    Потокобезопасность
    Высокая производительность в многопоточной среде

Минусы:
    Не поддерживается на версиях Java ниже 1.5 (в версии 1.5 исправили работу ключевого слова volatile)*/

public class SingletonDoubleCheckedLocking {
//    для корректной работы данного варианта реализации обязательно одно из двух условий.
//    Переменная INSTANCE должна быть либо final, либо volatile.
    private static SingletonDoubleCheckedLocking INSTANCE;

    private SingletonDoubleCheckedLocking() {
    }

    public static SingletonDoubleCheckedLocking getInstance() {

        if (INSTANCE == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {

                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return INSTANCE;
    }

}
