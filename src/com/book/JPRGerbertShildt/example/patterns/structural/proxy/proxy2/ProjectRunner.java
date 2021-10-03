package com.book.JPRGerbertShildt.example.patterns.structural.proxy.proxy2;

public class ProjectRunner {

    public static void main(String[] args) {

        Project project = new ProxyProject("https://github.com/Sergei-JD/bookExample");
        project.run();

    }

}
