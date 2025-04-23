package org.Revision;

public class CountPrime {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int count = sol.countPrimes(n);
        System.out.println("Number of primes less than " + n + " is: " + count);
    }
}

class Solution {
    public int countPrimes(int n) {
        return (int) java.util.stream.IntStream.range(2, n)
                .filter(Solution::isPrime)
                .count();
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return true;
    }
}