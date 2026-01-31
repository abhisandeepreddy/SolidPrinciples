package org.practical.OCP;

public class Debitcard implements PaymentMethod {

    @Override
    public void pay(int amount) {
        System.out.println("Amount paid via Debitcard "+amount);
    }
}
