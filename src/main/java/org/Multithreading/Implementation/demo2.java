package org.Multithreading.Implementation;

public class demo2 {
    public static void main(String[] args) {
        MyRunnable1 myRunnable = new MyRunnable1();
        MyRunnable2 myRunnable2 = new MyRunnable2();
        MyRunnable3 myRunnable3 = new MyRunnable3();
        Thread t1 = new Thread(myRunnable);
//        Thread t2 = new Thread(myRunnable2);
//        Thread t3 = new Thread(myRunnable3);
//        t1.start();
//        t2.start();
//        t3.start();

        myRunnable.run();
        myRunnable.run1();
//        t1.run();
//        t2.run();
    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class MyRunnable1 extends MyRunnable2 {


    public void run1() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());

        }

    }
}

class MyRunnable3 implements Runnable {

    @Override
    public void run() {
        for (int i = 21; i <= 30; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}