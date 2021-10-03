package com.book.JPRGerbertShildt.example.patterns.creational.factory_method.factory_method2;

public class Factory {

    public OS getCurrentOS(String inputos) {
        OS os = null;

        if (inputos.equals("windows")) {
            os = new windowsOS();
        } else if (inputos.equals("linux")) {
            os = new linuxOS();
        } else if (inputos.equals("mac")) {
            os = new macOS();
        }

        return os;
    }

}
