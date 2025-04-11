package org.Multithreading.Volatile;

class SignalController {
    volatile boolean greenSignal = true;

    public void turnRed() {
        System.out.println("Turning Signal to Red");
    }

    public void waitForRed() {
        System.out.println("Waiting for signal turn  to red");
        while (greenSignal) {

        }
        System.out.println("Signal is now red ");
    }
}


public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {
        SignalController controller = new SignalController();
        Thread police = new Thread(() -> {
            controller.waitForRed();
        });

        Thread signalChanger = new Thread(() -> {
            try {
                Thread.sleep(2000); // wait for 2 seconds
            } catch (InterruptedException e) {
            }
            controller.turnRed();
        });

        police.start();
        signalChanger.start();

        police.join();
        signalChanger.join();


    }
}

//
//🔍 What Happens Here:
//greenSignal is shared between 2 threads.
//
//volatile ensures latest value is seen by both threads.
//
//One thread is waiting for it to become false.
//
//Another thread changes it to false after 2 seconds.
//
//🔹 Without volatile – What Can Go Wrong?
//If volatile is removed, the waiting thread might keep checking an old value from its local cache, and never exit the loop, even though the value has been changed in memory.