package org.practical.DI.GoodCode;

public class NotificationService {

    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel){
        this.notificationChannel = notificationChannel;
    }

    public void NotifyCustomer(){
        notificationChannel.send();
    }

}
