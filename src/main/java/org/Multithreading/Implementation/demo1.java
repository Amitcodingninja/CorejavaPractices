package org.Multithreading.Implementation;
 // By Thread Method


public class demo1 {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.run();
        MyThread.sleep(5000);
        t2.run();
        MyThread.sleep(5000);
        t1.start();
        MyThread.sleep(5000);
        t2.start();


    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}