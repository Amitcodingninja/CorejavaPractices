package org.Revision;

import java.util.HashMap;

public class demo1 {
    public static void main(String[] args) {
//        int[] arr = new int[3];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;

        int[] arr = {1, 2, 2, 3, 3, 3, 4};


//        for (int i = 0; i < 2; i++) {
//            System.out.print(arr[i] * 2 + " ");
//        }

//        for (int n : arr) {
//            System.out.print(n * 2 + " ");
//        }

//        Arrays.sort(arr);
//        for (int n : arr){
//            System.out.print(n + " ");
//        }
//        int searchNumberIndex = Arrays.binarySearch(arr, 5);
//        System.out.println();
//        System.out.println(searchNumberIndex);
//
//    }


//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min){
//                min =arr[i];
//            }
//        }
//        System.out.println(min);
//    }
//        int sum = 0;
//        for (int n : arr) {
//            sum += n;// sum = sum +n ;
//        }
//
//        System.out.println(sum);

//        for (int i = arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] == arr[i+1]){
//                System.out.println(arr[i]);
//            }
//        }

//        for (int n : arr) {
//            if (n % 2 == 0) {
//                System.out.print(n + " ");
//            }
//        boolean isSorted = true;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                isSorted = false;
//                break;
//            }
//        }
//
//        if (isSorted) {
//            System.out.println("Sorted");
//        } else {
//            System.out.println("Not Sorted");
//        }
//
//        int n = arr.length + 1;
//        int totalSum = n * (n + 1) / 2;
////        System.out.println(totalSum);
//        int arrSum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arrSum += arr[i];
//        }
//
//        System.out.println(totalSum - arrSum);


//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-2]);

        HashMap<Integer, Integer> map = new HashMap();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);

        }

        System.out.println(map.entrySet());

        for (var n : map.entrySet()) {
            System.out.println(n.getKey() + " ➡️" + n.getValue() + " times");
        }

    }
}