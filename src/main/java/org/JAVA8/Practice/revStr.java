package org.JAVA8.Practice;

public class revStr {
    public static void main(String[] args) {
        int vowel = 0 ;
        String s = "hello";
//        for (int i = s.length() - 1; i >= 0; i--) {
//
//            System.out.print(s.charAt(i)+" ");
//        }

        char[] ch = s.toCharArray();
        for (int i = 0 ; i <=ch.length-1;i++){
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                vowel++;
            }
        }
        System.out.println(vowel);


    }
}
