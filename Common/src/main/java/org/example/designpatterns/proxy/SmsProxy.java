package org.example.designpatterns.proxy;

public class SmsProxy implements SmsService {
    private final SmsProviderA smsProviderA;
    private final SmsProviderB smsProviderB;

    public SmsProxy() {
        smsProviderA = new SmsProviderA();
        smsProviderB = new SmsProviderB();
    }

    @Override
    public String send(String phoneNum, String message) {
        String res = String.format("phone number %s can not find provider", phoneNum);
        if (phoneNum.startsWith("186")) {
            res = smsProviderA.send(phoneNum, message);
        }
        if (phoneNum.startsWith("180")) {
            res = smsProviderB.send(phoneNum, message);
        }
        System.out.println(res);
        return res;
    }
}
