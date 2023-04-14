package ProblemSolving;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word/phrase to check if it's a palindrome: ");
        String word = scanner.nextLine();

        boolean isPalindrome = palindromeCheck(word);

        if (isPalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }

    private static boolean palindromeCheck(String word) {

        char[] wordLTR =  word.toCharArray();
        char[] wordRTL =  new char[wordLTR.length];

        for (int i = wordLTR.length - 1; i >= 0; i--) {
            wordRTL[wordLTR.length - 1 - i] = wordLTR[i];
        }

        return Arrays.equals(wordLTR, wordRTL);
    }
}