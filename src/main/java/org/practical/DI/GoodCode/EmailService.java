package org.practical.DI.GoodCode;

public class EmailService implements NotificationChannel{

    @Override
    public void send() {
        System.out.println("Email sending");
    }
}
