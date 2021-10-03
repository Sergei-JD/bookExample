package com.book.JPRGerbertShildt.example.patterns.structural.decorator.decorator2;

public class SeniorDeveloper extends DeveloperDecorator {

    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return " Make code review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }

}
