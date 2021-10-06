package com.book.JPRGerbertShildt.example.patterns.behavioral.strategy.strategy3;

public class StrategyApp {

    public static void main(String[] args) {

        StrategyClient c = new StrategyClient();

        int[] arr0 = {1, 3, 2, 1};
        c.setStrategy(new SelectionSort());
        c.executeStrategy(arr0);
        System.out.println("===================================\n");

        int[] arr1 = {11, 4, 2, 7, 8, 54};
        c.setStrategy(new InsertingSort());
        c.executeStrategy(arr1);
        System.out.println("====================================\n");

        int[] arr2 = {3, -8, 2, 0, 33, 1, 3, 2};
        c.setStrategy(new BubbleSort());
        c.executeStrategy(arr2);
        System.out.println("====================================\n");

    }

}
