package ProblemSolving;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

// Get the strings from the command line
// Check id they're of same length, if not it's not an anagram
// Convert the string to char array
// Sort the char array
// Check if the arrays are equal

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the words/phrase to check if they're an anagram: ");
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        boolean areAnagram = anagramCheck(first, second);

        if (areAnagram) {
            System.out.println(first + " and " + second + " are an anagram" );
        } else {
            System.out.println(first + " and " + second + " are not an anagram" );
        }
    }

    private static boolean anagramCheck(String first, String second) {
        if (!Objects.equals(first.length(), second.length())) {
            return false;
        }

        char[] firstArray = first.toLowerCase().toCharArray();
        char[] secondArray = second.toLowerCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }
}
