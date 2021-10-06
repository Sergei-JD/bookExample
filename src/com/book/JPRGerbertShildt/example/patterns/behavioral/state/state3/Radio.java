package com.book.JPRGerbertShildt.example.patterns.behavioral.state.state3;

public class Radio {

    Station station;

    void setStation(Station st) {
        station = st;
    }

    void nextStation() {
        if (station instanceof RadioMinsk) {
            setStation(new RadioFM());
        }
        else if (station instanceof RadioFM) {
            setStation(new RadioNews());
        }
        else if (station instanceof RadioNews) {
            setStation(new RadioMinsk());
        }
    }

    void play() {
        station.play();
    }

}
