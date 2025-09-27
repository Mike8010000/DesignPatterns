package org.example.designpatterns.proxy;

public class StaticProxyTest {
    public static void  main(String[] args) {
        SmsProxy smsProxy = new SmsProxy();
        smsProxy.send("18613890123", "hello world!");
        smsProxy.send("18013890123", "hello world!");
        smsProxy.send("15213890123", "hello world!");
    }
}
