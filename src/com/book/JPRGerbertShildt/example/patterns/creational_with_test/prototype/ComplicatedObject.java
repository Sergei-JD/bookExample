package com.book.JPRGerbertShildt.example.patterns.creational_with_test.prototype;

public class ComplicatedObject implements Copyable {
    private Type type;
    public enum Type {
        ONE, TWO
    }
    public ComplicatedObject copy() {
        ComplicatedObject complicatedobject = new ComplicatedObject();
        return complicatedobject;
    }
    public void setType(Type type) {
        this.type = type;
    }
}
