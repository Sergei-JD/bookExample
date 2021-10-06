package com.book.JPRGerbertShildt.example.patterns.behavioral.mediator.mediator1;

public class MediatorRunner {

    public static void main(String[] args) {

        ConcreteMediator mediator = new ConcreteMediator();
        mediator.add(new ConcreteCollegue(mediator, "one"));
        mediator.add(new ConcreteCollegue(mediator, "two"));

        ConcreteCollegue concreteCollegue = new ConcreteCollegue(mediator, "three");
        mediator.add(concreteCollegue);
        concreteCollegue.changeStatus();

    }

}
