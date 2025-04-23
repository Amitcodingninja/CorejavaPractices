package org.Revision;

import java.util.Scanner;

//1234-> one two three four
public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int userInput = scanner.nextInt();
        String[] words = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        String numStr = String.valueOf(userInput);
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);

            int digit = ch - '0';  // Convert char to digit

            System.out.print(words[digit] + " ");
        }
    }
}



