package com.book.JPRGerbertShildt.example.patterns.structural.proxy.proxy2;

public class RealProject implements Project {

    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading project from " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }

}
