package org.Multithreading.Implementation;

public class SleepDemo {
    public static void main(String[] args) {
        Mythread m1 = new Mythread();
        m1.run();
        m1.start();

    }
}

class Mythread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}