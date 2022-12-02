package DSA;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmountOfWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");

	    //TODO <write your code here>
        String text = sc.nextLine();

        System.out.println("Amount of words in your text: " + getWordsAmount(text));
    }

    private static int getWordsAmount(String text) {
		//TODO <write your code here>
        Pattern pattern = Pattern.compile("[\\w-]+");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
