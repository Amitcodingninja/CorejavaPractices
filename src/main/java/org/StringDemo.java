package org;
// Vowel and consonent count
public class StringDemo {
    public static void main(String[] args) {
        String s = "HelAZOIdo";
        String lowerCase = s.toLowerCase();
        char[] ch = lowerCase.toCharArray();
        int vowel = 0;
        int consonent = 0;
        for (int i = 0; i < lowerCase.length(); i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                vowel++;
            } else {
                consonent++;
            }
        }

        System.out.println("Vowel : " + vowel + " Consonent : " + consonent);
    }
}

// Hello
//Hello World