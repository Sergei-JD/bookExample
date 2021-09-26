package com.book.JPRGerbertShildt.example.lambda.demo13;
//    ссылки на конструктор
//    имя_класса::new
public class MyClass {
    private int val;

    MyClass(int v) {
        val = v;
    }

    MyClass() {
        val = 0;
    }

    int getVal() {
        return val;
    };
}

class ConstructorRefDemo {

    public static void main(String[] args) {
        MyFunc myClassCons = MyClass::new;

        MyClass mc = myClassCons.func(100);

        System.out.println("Значения val в объекте mc равно " + mc.getVal());
    }

}
