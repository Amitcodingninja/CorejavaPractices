package org.Multithreading.Synchronization;

public class SynchronisedBlock extends Thread {
    Printer p;
    String mess;

    SynchronisedBlock(Printer p, String mess) {
        this.mess = mess;
        this.p = p;

    }

    @Override
    public void run() {
        p.print(mess);
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        SynchronisedBlock sb1 = new SynchronisedBlock(p, "Hello");
        SynchronisedBlock sb2 = new SynchronisedBlock(p, "Hello World");
        sb1.start();
        sb2.start();


    }
}

class Printer {
    void print(String msg) {
        System.out.println("Not Critical Code");

        synchronized (this) {
            System.out.println("Printing: " + msg);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

        System.out.println("Other Work");
    }
}