package com.book.JPRGerbertShildt.example.patterns.creational.singleton;

//Enum Singleton
//По мнению Joshua Bloch’а это лучший способ реализации шаблона

/*Плюсы:
    Остроумно
    Сериализация из коробки
    Потокобезопасность из коробки
    Возможность использования EnumSet, EnumMap и т.д.
    Поддержка switch

Минусы:
    Не ленивая инициализация.*/

public enum SingletonEnum {
    INSTANCE;
}
