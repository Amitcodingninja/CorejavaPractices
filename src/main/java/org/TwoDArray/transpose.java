package org.TwoDArray;

import java.util.Scanner;

public class transpose {
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

        System.out.println("Matrix is :  ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();

        }

        int n = arr.length;

        int transpose[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Transpose is:   ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
