package org.Multithreading.Synchronization;

public class TestSync2 extends Thread {
    Table t;

    TestSync2(Table t) {
        this.t = t;

    }

    @Override
    public void run() {
        t.printTable();
    }

    public static void main(String[] args) {
        Table t1 = new Table();
        TestSync2 t2 = new TestSync2(t1);
        TestSync2 t3 = new TestSync2(t1);

        t2.start();

        t3.start();

    }
}

class Table {
   synchronized void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}