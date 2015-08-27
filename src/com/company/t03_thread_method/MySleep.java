package com.company.t03_thread_method;

/**
 * Created by Mirim on 2015-08-25.
 */
public class MySleep {
    public static void main(String[] args) {
        class SampleThread extends Thread {
            @Override
            public void run() { // 오버라이딩
                System.out.println("SampleThread");
            }
        }
        SampleThread t1 = new SampleThread();
        SampleThread t2 = new SampleThread();

        System.out.println("t1 id:"+t1.getId());
        System.out.println("t1 id:"+t2.getId());

        System.out.println("t1 id:"+t1.getName());
        System.out.println("t1 id:"+t2.getName());

        System.out.println("t1 id:"+t1.getPriority());
        System.out.println("t1 id:"+t2.getPriority());

    }
}
