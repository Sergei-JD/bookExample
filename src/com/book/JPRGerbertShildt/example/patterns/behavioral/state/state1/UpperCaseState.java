package com.book.JPRGerbertShildt.example.patterns.behavioral.state.state1;

import java.util.Locale;

public class UpperCaseState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println(context.name.toUpperCase(Locale.ROOT));

    }

}
