package org.TwoDArray;

public class diagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println(diagonalSum(arr));

    }

    public static int diagonalSum(int[][] mat) {
        int res = 0;
        int n = mat.length;
        for (int i=0; i<n; i++) {
            res += mat[i][i]; // Primary diagonals are row = column!
            res += mat[n-1-i][i]; // Secondary diagonals are row + column = n-1!
        }
        return n % 2 == 0 ? res : res - mat[n/2][n/2]; // if n is a odd number, that mean we have added the center element twice!
    }
}
