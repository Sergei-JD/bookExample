package com.book.JPRGerbertShildt.example.patterns.behavioral.template_method.template_method2;

abstract class WebSiteTemplate {

    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();

}
