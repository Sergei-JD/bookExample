package com.book.JPRGerbertShildt.example.lambda.demo4;

public class BlockLambdaDemo {

    public static void main(String[] args) {

//        блочное лябда-выражение вычисляет факториал целочисленного значения
        NumericFunc factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("Факториал числа 3 равен " + factorial.fanc(3));
        System.out.println("Факториал числа 5 равен " + factorial.fanc(5));
        System.out.println("Факториал числа 6 равен " + factorial.fanc(6));
    }

}
