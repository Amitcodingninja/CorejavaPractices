package org.Revision;

public class demo5 {
    public static void main(String[] args) {
        String s = "9693596183";
//        char[] ch1 = s.toCharArray();
        StringBuilder sw = new StringBuilder(s);
//        String s1 = s.substring(0, 6);
//        System.out.println(s1);
//        char[] ch = s1.toCharArray();
//        for (int i = 0 ;i <ch.length;i++){
//            ch[i]='X';
//        }
//        for (char c : ch){
//            System.out.print(c);
//        }
//        String sb = sw.substring(0, 6);
//        System.out.println(sb);
//        String sb2 = s.substring(6, 10);
//        System.out.println(sb2);

//1st Way
        String A = "X".repeat(6) + s.substring(6, 10);
//
        System.out.println(A);


        // 2nd Way
        System.out.println(sw);
        for (int i = 0 ; i < 6;i++){
            sw.setCharAt(i , 'X');
        }

        System.out.println(sw);


    }
}
