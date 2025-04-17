package org.JAVA8.Practice;

class VolatileCounter {
    volatile int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

}


public class VolatileCounterTest {
    public static void main(String[] args) {
        VolatileCounter counter = new VolatileCounter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task, " Thread 1");
        Thread t2 = new Thread(task, " Thread 1");
        Thread t3 = new Thread(task, " Thread 1");
        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to finish
        try {


            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Print final result
        System.out.println("Expected Count: 3000");
        System.out.println("Actual Count: " + counter.getCount());
    }
}
