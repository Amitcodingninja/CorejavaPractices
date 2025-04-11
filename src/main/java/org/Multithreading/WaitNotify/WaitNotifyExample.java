package org.Multithreading.WaitNotify;

class Bank {

    boolean isManagerAvailable = false;

    public synchronized void customerWait(String name) {
        System.out.println(name + " waiting at the gate...");
        while (!isManagerAvailable) {
            try {
                wait(); // customer waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " got entry in the bank ✅");
    }

    public synchronized void managerNotify() {
        isManagerAvailable = true;
        System.out.println("Manager is now available. Notifying one customer...");
        notify(); // wakes up one waiting thread
    }

    // notifyAll version
    public synchronized void managerNotifyAll() {
        isManagerAvailable = true;
        System.out.println("Manager is now available. Notifying all customers...");
        notifyAll(); // wakes up all waiting threads
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Creating 3 customer threads
        Thread c1 = new Thread(() -> bank.customerWait("👤 Customer 1"));
        Thread c2 = new Thread(() -> bank.customerWait("👤 Customer 2"));
        Thread c3 = new Thread(() -> bank.customerWait("👤 Customer 3"));

        c1.start();
        c2.start();
        c3.start();

        // Wait 2 seconds and notify one
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        // Only one customer will get notified
//        bank.managerNotify();
//        bank.managerNotify();

        // Uncomment this for notifyAll demo

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        bank.managerNotifyAll();

        System.out.println();

    }
}

