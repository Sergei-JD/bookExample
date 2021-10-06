package com.book.JPRGerbertShildt.example.patterns.behavioral.chain_of_responsibility.chain_of_responsibility2;

public class BugTracker {

    public static void main(String[] args) {

        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifiManager("Everything is ok", Priority.ROUTINE);
        System.out.println();
        reportNotifier.notifiManager("Something went wrong", Priority.IMPORTANT);
        System.out.println();
        reportNotifier.notifiManager("Houston, we've had a problem", Priority.ASAP);

    }

}
