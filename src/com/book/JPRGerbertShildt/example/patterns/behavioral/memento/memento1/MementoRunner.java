package com.book.JPRGerbertShildt.example.patterns.behavioral.memento.memento1;

public class MementoRunner {

    public static void main(String[] args) {

        Originator originator = new Originator();

        originator.setState("one");
        System.out.println(originator.getState());

        CareTaker careTaker = new CareTaker();
        careTaker.setMomento(originator.createMomento());

        originator.setState("two");
        System.out.println(originator.getState());
        originator.getDataFromMomento(careTaker.getMomento());
        System.out.println(originator.getState());

    }

}
