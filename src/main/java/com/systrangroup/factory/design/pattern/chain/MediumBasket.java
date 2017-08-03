package com.systrangroup.factory.design.pattern.chain;

public class MediumBasket extends Basket {
    public MediumBasket(int size) {
        this.size = size;
    }

    protected void writeMessage(String msg) {
        System.out.println(msg);
    }
}
