package com.book.JPRGerbertShildt.example.patterns.structural.decorator.decorator1;

abstract class FileDecorator implements FileStream {

    FileStream fileDecorator;

    public FileDecorator(FileStream fileDecorator) {
        this.fileDecorator = fileDecorator;
    }

    public abstract void read();

}
