package com.solid.principles;

class ShoppingMallClass {
    private BankCard bankCard;

    public ShoppingMallClass(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }


}



