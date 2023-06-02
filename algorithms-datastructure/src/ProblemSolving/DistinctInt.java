package ProblemSolving;

import java.util.*;

public class DistinctInt {

    public static void main(String[] args) {
        distinctUsingSet(new int[]{7, 7, 9, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5});
        distinctUsingStreams(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5});
    }

    private static void distinctUsingSet(int[] arr) {
        Set<Integer> integerSet = new HashSet<>();
        for (int j : arr) {
            integerSet.add(j);
        }
        int[] result = integerSet.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
    }

    private static void distinctUsingStreams(int[] arr) {
        int[] result = Arrays.stream(arr).distinct().toArray();
        int maxVal = Arrays.stream(arr).max().getAsInt();
        System.out.println(Arrays.toString(result));
        System.out.println("max value = " + maxVal);
    }
}
