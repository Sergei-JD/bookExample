package com.book.JPRGerbertShildt.example.patterns.behavioral.chain_of_responsibility.chain_of_responsibility3;

public class ChainRunner {

    public static void main(String[] args) {

        Logger smsLogger = new SMSLogger(Level.ERROR);
        Logger fileLogger = new FileLogger(Level.DEBUG);
        Logger emailLogger = new EmailLogger(Level.INFO);

        smsLogger.setNext(fileLogger);
        System.out.println();
        fileLogger.setNext(emailLogger);

        smsLogger.writeMessage("все хорошо ", Level.INFO);
        smsLogger.writeMessage("идет режим отладки", Level.DEBUG);
        smsLogger.writeMessage("система упала", Level.ERROR);
        System.out.println();

    }

}
