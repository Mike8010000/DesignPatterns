package org.example.designpatterns.proxy;

public class SmsProviderB implements SmsService {
    @Override
    public String send(String phoneNum, String message) {
        System.out.printf("send message %s to provider b user %s%n", message, phoneNum);
        return "provider b send success";
    }
}
