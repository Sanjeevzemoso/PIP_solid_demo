package com.solid.principles;

class DebitCardClass implements BankCard {
    @Override
    public void doTransaction(long amount) {
        System.out.println("payment using Debit card");
    }
}



