package com.book.JPRGerbertShildt.example.patterns.behavioral.state.state3;

public class StateApp {

    public static void main(String[] args) {

        Station minsk = new RadioMinsk();
        Radio radio = new Radio();

        radio.setStation(minsk);

        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }

    }

}
