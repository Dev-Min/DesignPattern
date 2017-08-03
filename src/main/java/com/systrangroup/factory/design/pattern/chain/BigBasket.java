package com.systrangroup.factory.design.pattern.chain;

public class BigBasket extends Basket {
    public BigBasket(int size) {
        this.size = size;
    }

    protected void writeMessage(String msg) {
        System.out.println(msg);
    }
}
