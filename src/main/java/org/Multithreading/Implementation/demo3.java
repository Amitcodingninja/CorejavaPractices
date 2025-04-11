package org.Multithreading.Implementation;

public class demo3 {
    public static void main(String[] args)  {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                demo3.print();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
//            Thread.sleep(1000);
        }

    }

    public static void print() throws Exception {
        Thread.sleep(1000);
    }
}
