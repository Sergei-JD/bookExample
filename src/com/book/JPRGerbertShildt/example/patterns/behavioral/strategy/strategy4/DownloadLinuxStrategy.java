package com.book.JPRGerbertShildt.example.patterns.behavioral.strategy.strategy4;

public class DownloadLinuxStrategy implements Strategy {

    public void download(String file) {
        System.out.println("linux download: " + file);
    }

}
