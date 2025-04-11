package org.TwoDArray;

public class revStr {
    public static void main(String[] args) {
//        StringBuilder s = new StringBuilder("Hello");
//        s.reverse();
//        System.out.println(s);
        char [] spg = {'A','e','l','l','o'};

        reverseString(spg);


    }

    //    {'H','e','l','l','o'}
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
        System.out.println(s);

    }
}
