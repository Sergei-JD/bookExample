package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor2;

public interface Developer {

    public void create(ProjectClass projectClass);

    public void create(Database database);

    public void create(Test test);

}
