package com.book.JPRGerbertShildt.example.lambda.demo5;

public class BlockLambdaDemo2 {

    public static void main(String[] args) {

        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for (int j = str.length() - 1; j >= 0 ; j--)
                result += str.charAt(j);

            return result;
        };

        System.out.println("Лямбда обращается на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " + reverse.func("Выражение"));
    }
}
