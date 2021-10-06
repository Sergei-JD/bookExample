package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor3;

public class MechanicVisitor implements Visitor {

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Проверил двигатель");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Отполировал корпус");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Проверил внешний вид автомобиля");
    }

    @Override
    public void visit(WheelElement wheelElement) {
        System.out.println("Подкачал " + wheelElement.getName() + " колесо");
    }

}
