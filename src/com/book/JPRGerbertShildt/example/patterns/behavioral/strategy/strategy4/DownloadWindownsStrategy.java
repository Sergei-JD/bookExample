package com.book.JPRGerbertShildt.example.patterns.behavioral.strategy.strategy4;

public class DownloadWindownsStrategy implements Strategy {

    public void download(String file) {
        System.out.println("windows download: " + file);
    }

}
