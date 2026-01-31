package org.practical.OCP;

public class Creditcard implements PaymentMethod {

    @Override
    public void pay(int amount) {
        System.out.println("Amount paid via Creditcard "+amount);
    }
}
