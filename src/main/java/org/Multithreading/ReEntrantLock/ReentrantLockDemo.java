package org.Multithreading.ReEntrantLock;

import java.util.concurrent.locks.ReentrantLock;

class LockBathroom {

    ReentrantLock lock = new ReentrantLock();

    public void use() {
        lock.lock(); // Lock manually
        try {
            System.out.println(Thread.currentThread().getName() + " entered bathroom 🚿");
            Thread.sleep(1000); // Simulate bathroom use
            System.out.println(Thread.currentThread().getName() + " exited bathroom 🚪");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // Always unlock!
        }
    }
}

public class ReentrantLockDemo {
    public static void main(String[] args) {
        LockBathroom bathroom = new LockBathroom();

        Runnable task = () -> bathroom.use();

        Thread t1 = new Thread(task, "👦 Boy-1");
        Thread t2 = new Thread(task, "👦 Boy-2");

        t1.start();
        t2.start();
    }
}
