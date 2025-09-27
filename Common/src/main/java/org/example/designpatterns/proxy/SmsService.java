package org.example.designpatterns.proxy;

public interface SmsService {
    String send(String phoneNum, String message);
}
