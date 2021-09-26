package com.book.JPRGerbertShildt.example.lambda.demo12;

public class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;

        for (T val : vals)
            if (val == v)
                count++;

            return count;
    }
}
class GenericMethodRefDemo {
    static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"Один", "Два", "Три", "Два"};
        int count;

        count = myOp(MyArrayOps::countMatching, vals, 4);
        System.out.println("Массив vals  содержит " + count + " числа четыре");

        count = myOp(MyArrayOps::countMatching, strs, "Два");
        System.out.println("Массив strs содержит " + count + " числа два");
    }
}