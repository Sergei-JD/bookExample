package com.book.JPRGerbertShildt.example.patterns.structural.proxy.proxy3;

public class RealImage implements Image {

    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("загрузка " + file);
    }

    @Override
    public void display() {
        System.out.println("Просмотр " + file);
    }

}
