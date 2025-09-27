package org.example.designpatterns.proxy;

public class SmsProviderA implements SmsService {
    @Override
    public String send(String phoneNum, String message) {
        System.out.printf("send message %s to provider a user %s%n", message, phoneNum);
        return "provider a send success";
    }
}
