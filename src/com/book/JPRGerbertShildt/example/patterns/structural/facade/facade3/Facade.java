package com.book.JPRGerbertShildt.example.patterns.structural.facade.facade3;

public class Facade {

    Power power = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    void copy() {
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);

    }

}
