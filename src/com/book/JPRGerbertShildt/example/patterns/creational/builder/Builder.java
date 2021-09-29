package com.book.JPRGerbertShildt.example.patterns.creational.builder;

public class Builder {

    public static void main(String[] args) {
        Person person1 = new PersonBuilderMpl().setName("John").build();
        Person person2 = new PersonBuilderMpl().setName("Alex").setAge(22).build();
        Person person3 = new PersonBuilderMpl().setName("Mike").setAge(45).senSalary(200).build();

        person1.print();
        person2.print();
        person3.print();
    }

}

class Person {
    String name;
    int age;
    double salary;
    //...
    public void print() {
        System.out.println(name + " " + age + " " + salary);
    }
}

interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder senSalary(double salary);
    Person build();
}

class PersonBuilderMpl implements PersonBuilder {
    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder senSalary(double salary) {
        person.salary = salary;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
