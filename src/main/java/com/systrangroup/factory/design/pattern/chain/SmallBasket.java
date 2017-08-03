package com.systrangroup.factory.design.pattern.chain;

public class SmallBasket extends Basket {
    public SmallBasket(int size) {
        this.size = size;
    }

    protected void writeMessage(String msg) {
        System.out.println(msg);
    }
}