package com.book.JPRGerbertShildt.example.patterns.behavioral.state.state1;

public class StateRunner {

    public static void main(String[] args) {

        Context context = new Context(new LoverCaseState(), "Sergei");
        context.doAction();

        context.setState(new UpperCaseState());
        context.doAction();

    }

}
