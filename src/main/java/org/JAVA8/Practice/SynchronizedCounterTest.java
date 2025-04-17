package org.JAVA8.Practice;

class SynchronizedCounter {
    int count = 0;

    public  void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

}


public class SynchronizedCounterTest {
    public static void main(String[] args) {
        SynchronizedCounter counter = new SynchronizedCounter();

        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task1, "Thread1");
        Thread t2 = new Thread(task1, "Thread2");
        Thread t3 = new Thread(task1, "Thread3");


        // Start threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to complete
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());


    }
}

