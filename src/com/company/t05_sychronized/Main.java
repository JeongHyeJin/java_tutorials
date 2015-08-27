package com.company.t05_sychronized;

/**
 * Created by Mirim on 2015-08-25.
 */
public class Main {
    public static void main(String[] args) {

        Calculate calc = new  Calculate();
        MyThread t1 = new MyThread(calc);
        MyThread t2 = new MyThread(calc);

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("calc value : "+calc.getAmount());

    }
}
