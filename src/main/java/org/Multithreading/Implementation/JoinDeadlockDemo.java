package org.Multithreading.Implementation;

public class JoinDeadlockDemo {
    public static void main(String[] args) {
        DeadlockThread t1 = new DeadlockThread("Thread-1");
        DeadlockThread t2 = new DeadlockThread("Thread-2");

        t1.setOtherThread(t2);
        t2.setOtherThread(t1);

        t1.start();
        t2.start();
    }
}

class DeadlockThread extends Thread {
    private Thread other;

    DeadlockThread(String name) {
        super(name);
    }

    void setOtherThread(Thread other) {
        this.other = other;
    }

    public void run() {
        System.out.println(getName() + " started");
        try {
            other.join();  // Intentional deadlock
            System.out.println(getName() + " finished");
        } catch (InterruptedException e) {
            System.err.println(getName() + " interrupted");
        }
    }
}

//
//"join() blocks the current thread until the target thread finishes," +
//        " which can hurt performance and reduce parallelism. If used" +
//        " carelessly, it may cause deadlocks or make debugging harder." +
//        " It should be used only when strictly needed, like waiting for " +
//        "task completion or result dependency."