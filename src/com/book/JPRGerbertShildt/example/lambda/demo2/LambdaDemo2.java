package com.book.JPRGerbertShildt.example.lambda.demo2;

public class LambdaDemo2 {

    public static void main(String[] args) {

        NumericTest isEven = (n) -> (n % 2) == 0;
//        эквивалентные выражения
//        указание типа данных в большинстве случаев не обязательно
//        NumericTest isEven = (int n) -> (n % 2) == 0;
//        если у лямбда-выражения всего один параметр
//        NumericTest isEven = n -> (n % 2) == 0;

        if(isEven.test(10))
            System.out.println("Четное 10 число");
        if (!isEven.test(9))
            System.out.println("Число 9 нечетное");

        NumericTest isNonNeg = (n) -> n >= 0;

        if(isNonNeg.test(1))
            System.out.println("Число 1 неотрицательное");
        if (!isNonNeg.test(-1))
            System.out.println("Чмчло -1 отрицательное");
    }

}
