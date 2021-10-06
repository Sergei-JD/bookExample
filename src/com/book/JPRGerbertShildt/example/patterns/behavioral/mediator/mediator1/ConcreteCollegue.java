package com.book.JPRGerbertShildt.example.patterns.behavioral.mediator.mediator1;

public class ConcreteCollegue implements Collegue {

    boolean status;
    Mediator mediator;
    String name;

    public ConcreteCollegue(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void setFalse() {
        status = false;
        System.out.println(name + " status is false");
    }

    @Override
    public void SetTrue() {
        status = true;
        System.out.println(name + " status is true");
    }

    @Override
    public void changeStatus() {
        mediator.requestAll(this);
    }

}
