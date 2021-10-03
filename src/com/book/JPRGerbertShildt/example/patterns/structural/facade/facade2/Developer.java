package com.book.JPRGerbertShildt.example.patterns.structural.facade.facade2;

public class Developer {

    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading Habrahabr...");
        }
    }

}
