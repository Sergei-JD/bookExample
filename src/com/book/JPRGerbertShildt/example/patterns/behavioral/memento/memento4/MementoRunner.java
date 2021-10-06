package com.book.JPRGerbertShildt.example.patterns.behavioral.memento.memento4;

public class MementoRunner {

    public static void main(String[] args) {

        //Инициализация "хозяина" с некоторым начальным состоянием
        Originator originator = new Originator();
        originator.setState("Ok!");
        System.out.println(originator.getState());

        //Инициализация "механизма отката" и сохранение текущего состояния "хозяина"
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("Error!");
        System.out.println(originator.getState());

        //Восстановление ранее сохранённого состояния "хозяина"
        originator.setMemento(caretaker.getMemento());
        System.out.println(originator.getState());

    }

}
