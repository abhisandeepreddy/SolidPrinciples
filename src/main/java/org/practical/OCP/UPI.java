package org.practical.OCP;

public class UPI implements PaymentMethod {

    @Override
    public void pay(int amount) {
        System.out.println("Amount paid via UPI "+amount);
    }
}
