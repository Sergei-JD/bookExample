package com.book.JPRGerbertShildt.example.patterns.behavioral.observer.observer2;

import com.book.JPRGerbertShildt.example.patterns.behavioral.iterator.iterator2.JavaDeveloper;

public class JobSearch {

    public static void main(String[] args) {

        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Kevin Hurt");
        Observer secondSubscriber = new Subscriber("Jim Jeffris");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java Position");

    }

}
