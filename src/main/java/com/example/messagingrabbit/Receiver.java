package com.example.messagingrabbit;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;
//POJO PLAIN OLD JAVA OBJECT
@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiverMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
