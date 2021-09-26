package com.book.JPRGerbertShildt.example.lambda.demo7;

import java.util.Locale;

public class LambdaAsArgumentDemo {
    static String stringOp (StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лябда-выражения повышают эффективность Java";
        String outStr;

        System.out.println("Это исходная строка: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Эта строка прописными буквами: " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            int i;

            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);

            }
            return result;
        }, inStr);

        System.out.println("Эта строка будет с удаленными пробелами: " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));
    }
}
