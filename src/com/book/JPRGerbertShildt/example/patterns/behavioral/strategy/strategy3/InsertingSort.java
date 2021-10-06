package com.book.JPRGerbertShildt.example.patterns.behavioral.strategy.strategy3;

import java.util.Arrays;

public class InsertingSort implements Sorting {

    public void sort(int[] arr) {
        System.out.println("Сортировка вставками");
        System.out.println("до:\t" + Arrays.toString(arr));

        for (int barier = 1; barier < arr.length - 1; barier++) {
            int index = barier;
            while (index - 1 >= 0 && arr[index] < arr[index - 1]) {
                int tmp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = tmp;
                index--;
            }
        }
        System.out.println("после:\t" + Arrays.toString(arr));
    }

}
