package com.solid.principles;

class CreditCardClass implements BankCard {
    @Override
    public void doTransaction(long amount) {
        System.out.println("payment using Credit card");
    }
}
