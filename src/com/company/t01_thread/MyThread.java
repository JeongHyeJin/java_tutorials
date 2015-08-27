package com.company.t01_thread;

/**
 * Created by Mirim on 2015-08-25.
 */
public class MyThread {
    public static void main(String[] args) {
        class SampleThread extends Thread {
            public void run() {
                System.out.println("Run 메소드 실행");
            }
        }

        class RunnableSample implements Runnable {
            @Override
            public void run() { // 오버라이딩
                System.out.println("SampleRunnable");
            }
        }

        for(int i=0 ; i<100; i++) {
            SampleThread t = new SampleThread();
            t.start();

            RunnableSample runable = new RunnableSample();
            new Thread(runable).start();
        }
     /*   Thread t2 = new Thread(runable);
        t2.start();*/
        System.out.println("program end");
    }
}
