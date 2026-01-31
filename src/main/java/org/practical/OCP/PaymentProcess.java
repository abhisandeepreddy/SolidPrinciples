package org.practical.OCP;

public class PaymentProcess {

    public void processPayment(PaymentMethod paymentMethod, int amount){
        paymentMethod.pay(amount);
    }
}
