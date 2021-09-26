package com.book.JPRGerbertShildt.example.lambda.demo6;


//  Применить обобщенный функциональный интерфейс с разнотипными лябда-выражениями
public class GenericFunctionalInterfaceDemo {

    public static void main(String[] args) {
//        Использовать строковый вариант функционального интерфейса SomeFunc
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;

            for (int j = str.length() -1; j >= 0; j--)
                result += str.charAt(j);

            return result;
        };

        System.out.println("Лямбда обращается на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " + reverse.func("Выражение"));

//        Использовать целочисленный вариант функционального интерфейса SomeFunc
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = i * result;

        return result;
        };

        System.out.println("Факториал числа 3 равен " + factorial.func(3));
        System.out.println("Факториал числа 5 равен " + factorial.func(5));
    }
}
