package org.Revisions;

public class QuoteRemove {
    public static void main(String[] args) {
        String s = "0987654345"; // XXXXXX4345
        StringBuilder s1 = new StringBuilder(s);
//        System.out.println(s1);
////        s1.setCharAt(0,' ');
//        s1.setCharAt(s1.length()-1,' ');
//        System.out.println(s1);

//        System.out.println(s.replace("'",""));

        for (int i =0 ; i<6;i++){
            s1.setCharAt(i ,'X');
        }

        System.out.println(s1);
    }
}
