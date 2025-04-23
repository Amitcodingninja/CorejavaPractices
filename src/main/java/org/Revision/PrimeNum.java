package org.Revision;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int startingPoint = s.nextInt();
        int EndPoint = s.nextInt();
        int total = 0;
        for (int i = startingPoint; i <= EndPoint; i++) {
            if (isPrime(i)) {
//                System.out.print(i + " ");
                total++;

            }
        }
        System.out.println("\nTotal Prime Numbers " + total);


    }

    //hello  holle
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;


    }

    public static int totalPrime(int num) {
        int totalPrimeNumber = 0;

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                totalPrimeNumber++;
            }
        }
        return totalPrimeNumber;


    }
}