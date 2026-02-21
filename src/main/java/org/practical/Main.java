package org.practical;

import org.practical.DI.GoodCode.EmailService;
import org.practical.DI.GoodCode.NotificationService;
import org.practical.DI.GoodCode.SMSService;
import org.practical.LSP.ReadonlyFile;
import org.practical.LSP.WriteableFile;
import org.practical.OCP.Creditcard;
import org.practical.OCP.Debitcard;
import org.practical.OCP.PaymentProcess;
import org.practical.OCP.UPI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new SMSService());
        notificationService.NotifyCustomer();

    }
}