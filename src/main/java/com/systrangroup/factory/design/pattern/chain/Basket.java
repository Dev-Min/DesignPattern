package com.systrangroup.factory.design.pattern.chain;

public abstract class Basket {
	public static int SMALL = 1;
    public static int MEDIUM = 2;
    public static int LARGE = 3;
    protected int size;

    // The next element in the chain of responsibility
    protected Basket next;

    public Basket setNext(Basket basket) {
        next = basket;
        return basket;
    }

    public void shoot(String ball, int size) {
        if (size <= this.size) {
            writeMessage(ball);
        }
        if (next != null) {
    		System.out.println(ball + " is so big");
            next.shoot(ball, size);
        }
    }

    abstract protected void writeMessage(String msg);
}
