package org.TwoDArray;

public class demo1 {
    public static void main(String[] args) {
//        int[][] arr = new int[3][3];

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][i];
        }

        System.out.println(sum);


    }
}
