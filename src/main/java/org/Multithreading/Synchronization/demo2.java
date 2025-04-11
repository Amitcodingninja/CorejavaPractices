package org.Multithreading.Synchronization;
//Example 1: synchronized (Thread-safe Counter)

class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class demo2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();

            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count Synchronised  :  " + counter.count);
    }

}
