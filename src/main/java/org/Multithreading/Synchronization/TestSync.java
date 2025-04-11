package org.Multithreading.Synchronization;


class BankAccount {
    private  int balance = 1000;

    public synchronized void withdrawl(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing ");
            balance = balance - amount;
            System.out.println("Balance Left " + balance);

        } else {
            System.out.println("Insuffient Balance" + Thread.currentThread().getName());
        }
    }

}
    public class TestSync {
        public static void main(String[] args) {
            BankAccount ac = new BankAccount();
            Runnable r = () -> ac.withdrawl(700);

            Thread t1 = new Thread(r, "Person A");
            Thread t2 = new Thread(r, "Person B");
            t1.start();
            t2.start();


        }
    }
