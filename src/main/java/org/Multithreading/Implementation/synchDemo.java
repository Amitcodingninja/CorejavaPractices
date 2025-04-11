package org.Multithreading.Implementation;

public class synchDemo {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        Thread t1 = new Thread(() -> b1.withDrawl(700));
        Thread t2 = new Thread(() -> b1.withDrawl(700));

        t1.start();
        t2.start();


    }
}

class BankAccount extends Thread {
    private int balance = 1000;

    public synchronized   void withDrawl(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " WithDrawl " + amount);
            balance -= amount;
            System.out.println("Balance " + balance);
        } else {
            System.out.println("Not Enough Balance");
        }
    }
}