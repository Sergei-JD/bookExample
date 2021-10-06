package com.book.JPRGerbertShildt.example.patterns.behavioral.observer.observer2;

public interface Observed {

    public void addObserver(Observer observer);

    public void removeObsrever(Observer observer);

    public void notifyObservers();

}
