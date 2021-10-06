package com.book.JPRGerbertShildt.example.patterns.behavioral.state.state1;

import java.util.Locale;

public class LoverCaseState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println(context.name.toLowerCase(Locale.ROOT));

    }

}
