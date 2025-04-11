package org.Multithreading.Deadlock;

class DeadlockExample {
    static final Object toothbrush = new Object();
    static final Object toothpaste = new Object();

    public static void main(String[] args) {
        Thread boy1 = new Thread(() -> {
            synchronized (toothbrush) {
                System.out.println("Boy-1 has Toothbrush 🪥");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (toothpaste) {
                    System.out.println("Boy-1 got Toothpaste and started brushing 😁");
                }
            }
        });

        Thread boy2 = new Thread(() -> {
            synchronized (toothpaste) {
                System.out.println("Boy-2 has Toothpaste 🧴");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (toothbrush) {
                    System.out.println("Boy-2 got Toothbrush and started brushing 😁");
                }
            }
        });

        boy1.start();
        boy2.start();
    }
}

