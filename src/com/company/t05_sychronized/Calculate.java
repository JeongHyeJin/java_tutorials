package com.company.t05_sychronized;

/**
 * Created by Mirim on 2015-08-27.
 */
public class Calculate {
    private int amount;

    public void Calculate() {
        amount = 0;
    }

    public synchronized void plus(int value) {
        amount += value;
    }

    public void minus(int value) {
        amount -= value;
    }

    public int getAmount() {
        return amount;
    }
}
