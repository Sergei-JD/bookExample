package com.book.JPRGerbertShildt.example.lambda.demo14;
//    ссылки на конструкторы обобщенного класса
public class MyClass<T> {
    private T val;

    MyClass(T v) {
        val = v;
    }

    MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    };
}

class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc<Integer> myClassCons = MyClass<Integer>::new;

        MyClass<Integer> mc = myClassCons.func(100);

        System.out.println("Значение val  в объекте " + mc.getVal());
    }
}
