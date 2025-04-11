package org.TwoDArray;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row value");
        int row = s.nextInt();

        System.out.println("Enter col value");
        int col = s.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter Matrix Element");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();

        }

        System.out.println("This is primary sum");

        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i][i];
        }

//        System.out.println(sum1);

        System.out.println("This is Secondry Sum");

        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i][n - i -1];
        }

        System.out.println(sum+sum1);
    }




}




