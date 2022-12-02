package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer numbers separated by space: ");

	    //TODO <write your code here>
        String s[] = sc.nextLine().split(" ");
        int[] intArray = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            intArray[i] = Integer.parseInt(s[i]);
        }

        System.out.println(intArray);
        System.out.println("*** Initial Array ***");
        System.out.println(Arrays.toString(intArray));
        System.out.println("*** Max number in array ***");
        System.out.println(findMaxIntInArray(intArray));
    }


    public static int findMaxIntInArray(int[] intArray) {
		//TODO <write your code here>
        int temp = Integer.MIN_VALUE;
        int maxInt = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > temp) {
                temp = intArray[i];
                maxInt = temp;
            }
        }
        return maxInt;
    }
}

