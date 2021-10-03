package com.book.JPRGerbertShildt.example.patterns.structural.flyweight.flyweight1;

import java.util.HashMap;
import java.util.Map;

public class FlyweightGarage {

    Map<String, Mercedes> map = new HashMap<>();

    Mercedes getMercedes(String color) {
        Mercedes mercedes = map.get(color);

        if (mercedes == null) {
            mercedes = new Mercedes();
            mercedes.color = color;
            map.put(color, mercedes);
        }

        return mercedes;
    }

}
