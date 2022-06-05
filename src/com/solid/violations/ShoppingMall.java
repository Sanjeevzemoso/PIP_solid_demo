package com.solid.violations;

class ShoppingMall {

    private DebitCard debitCard;
    private CreditCard creditCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public ShoppingMall(CreditCard creditCard){
        this.creditCard = creditCard;
    }

    public void doPurchaseSomething(long amount) {
        creditCard.doTransaction(amount);
    }


}



