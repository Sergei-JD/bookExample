package com.book.JPRGerbertShildt.example.patterns.behavioral.mediator.mediator1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    List<Collegue> collegues = new ArrayList<>();

    void add(Collegue collegue) {
        collegues.add(collegue);
    }

    @Override
    public void requestAll(Collegue collegue) {

        collegue.SetTrue();

        for (Collegue coll: collegues) {
            if (coll != collegue) {
                coll.setFalse();
            }
        }

    }

}
