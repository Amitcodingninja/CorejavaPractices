package org.Multithreading.Implementation;

public class joinDemo {
    public static void main(String[] args) throws InterruptedException {

        Mythreads m1 = new Mythreads();
        Mythreads m2 = new Mythreads();
        m2.start();
        m2.join();
        m1.start();




    }
}

class Mythreads extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}