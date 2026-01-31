package org.practical;

import org.practical.OCP.Creditcard;
import org.practical.OCP.Debitcard;
import org.practical.OCP.PaymentProcess;
import org.practical.OCP.UPI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentProcess process = new PaymentProcess();
        String paymentType = "upi";
        if(paymentType.equalsIgnoreCase("debitcard")){
            process.processPayment(new Debitcard(), 1000);
        }
        else if(paymentType.equalsIgnoreCase("creditcard")){
            process.processPayment(new Creditcard(), 5000);
        }
        else if(paymentType.equalsIgnoreCase("upi")){
            process.processPayment(new UPI(), 100);
        }
    }
}