package org.practical.DI.GoodCode;

public class SMSService implements NotificationChannel{

    @Override
    public void send() {
        System.out.println("SMS sending");
    }
}
