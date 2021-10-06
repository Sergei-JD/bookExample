package com.book.JPRGerbertShildt.example.patterns.behavioral.observer.observer1;

public interface Observable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
