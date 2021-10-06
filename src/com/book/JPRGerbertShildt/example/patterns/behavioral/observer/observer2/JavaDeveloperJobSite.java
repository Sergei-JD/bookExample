package com.book.JPRGerbertShildt.example.patterns.behavioral.observer.observer2;

import com.book.JPRGerbertShildt.example.patterns.behavioral.observer.observer1.Observable;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {

    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribies = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribies.add(observer);
    }

    @Override
    public void removeObsrever(Observer observer) {
        this.subscribies.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribies) {
            observer.handleEvent(this.vacancies);
        }
    }

}
