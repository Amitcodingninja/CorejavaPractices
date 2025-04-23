package org.Basic;

// Missing Num  3 5 6 7
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9, 10};
        for (int i = 1; i < arr.length; i++) {
            int prev = arr[i - 1];
            int curr = arr[0];
            for (int j = prev + 1; j < curr; j++) {
                System.out.println(j);
            }
        }
    }
}

