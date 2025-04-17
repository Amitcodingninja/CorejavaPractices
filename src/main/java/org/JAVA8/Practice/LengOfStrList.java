package org.JAVA8.Practice;

public class LengOfStrList {
    public static void main(String[] args) {
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        List<Integer> collect = words
//                .stream()
//                .map(s -> s.length())
//                .collect(Collectors.toList());
//        System.out.println(collect);

//        List<Integer> words = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> collect = words.stream().map(n -> n * n).collect(Collectors.toList());
//        System.out.println(collect);

//        for (int i = 1 ; i<=5;i++){
//            System.out.println(i*i);
//        }

//        for (int i = 1; i <= 3; i++) {
//            for (int j = 3; j >= i; --j) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int i = 1 ; i <=3; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
