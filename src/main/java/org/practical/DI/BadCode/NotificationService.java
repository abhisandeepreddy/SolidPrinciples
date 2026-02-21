package org.practical.DI.BadCode;

public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService(){
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void notifyEmail(String msg){
        emailService.sendEmail(msg);
    }

    public void notifySMS(String msg){
        smsService.sendSMS(msg);
    }
}
