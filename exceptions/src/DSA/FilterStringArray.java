package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilterStringArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any words separated by space: ");
        String userInput = sc.nextLine();
        System.out.print("Please, enter minumum word length to filter words: ");
        int minLength = sc.nextInt();

        String[] words = userInput.split("\\s+");
        String[] filteredWords = filterWordsByLength(minLength, words);
        System.out.println(Arrays.toString(filteredWords));
    }



    public static String[] filterWordsByLength(int minLength, String[] words) {
		//TODO <write your code here>

        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if ((words[i]).length() > minLength) {
                list.add(words[i]);
            }
        }
        String[] result = new String[list.size()];
        result = list.toArray(result);
        return  result;
    }

}
