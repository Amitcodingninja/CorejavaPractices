package org.Multithreading.Deadlock;

class DeadlockResolved {
    static final Object toothbrush = new Object();
    static final Object toothpaste = new Object();

    public static void main(String[] args) {
        Runnable brushingTask = () -> {
            synchronized (toothbrush) {
                synchronized (toothpaste) {
                    System.out.println(Thread.currentThread().getName() + " got both and is brushing 😁");
                }
            }
        };

        Thread boy1 = new Thread(brushingTask, "Boy-1");
        Thread boy2 = new Thread(brushingTask, "Boy-2");

        boy1.start();
        boy2.start();
    }
}

