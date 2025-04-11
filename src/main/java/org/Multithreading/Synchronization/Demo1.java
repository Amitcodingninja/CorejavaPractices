package org.Multithreading.Synchronization;

public class Demo1 {
    public static int counter = 0;

    public static void main(String[] args) {
        Runnable run = () -> {
            for (int i = 1; i <= 10000; i++) {
                counter++;
            }

        };
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.start();
        t2.start();
        try {


            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
