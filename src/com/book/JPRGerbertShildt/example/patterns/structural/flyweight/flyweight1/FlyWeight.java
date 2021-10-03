package com.book.JPRGerbertShildt.example.patterns.structural.flyweight.flyweight1;

public class FlyWeight {

    public static void main(String[] args) {

        FlyweightGarage flyWeightGarage = new FlyweightGarage();
        Mercedes mercedes1 = flyWeightGarage.getMercedes("green");
        Mercedes mercedes2 = flyWeightGarage.getMercedes("green");

        System.out.println(mercedes1.color);
        System.out.println(mercedes2.color);
        System.out.println(mercedes1.equals(mercedes2));

        System.out.println(mercedes1.hashCode());
        System.out.println(mercedes2.hashCode());

    }

}
