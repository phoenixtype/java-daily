package ProblemSolving;


import java.util.ArrayList;
import java.util.List;

/**
     * Question
    Choose a coin that is lighter than the other 8 coins with the smallest number of comparison using a scale.
    solve this using java and what data structure or algorithm would be best for this. Also, explain its time and space complexity

    To solve this problem, you can use the "Divide and Conquer" algorithm.
    In this approach, you can divide the coins into three groups of three coins each.
    Compare the weight of the first two groups to find the lighter group.
    Then, compare two coins from the lighter group.
    The lighter coin will be the one you are looking for.
    The algorithm requires a maximum of 3 comparisons.
     */

public class CoinCompare {

    public static void main(String[] args) {
        int[] coins = {0, 1, 1, 1, 1, 1, 1, 1, 1}; // 0 represents the lighter coin
        System.out.println("The lighter coin is at index: " + findLighterCoin(coins, 0, coins.length - 1));
    }

    public static int findLighterCoin(int[] coins, int start, int end) {
        if (start == end) {
            return start;
        }

        int groupSize = (end - start + 1) / 3;
        int group1Start = start;
        int group1End = start + groupSize - 1;
        int group2Start = group1End + 1;
        int group2End = group2Start + groupSize - 1;
        int group3Start = group2End + 1;

        int comparison = compareGroups(coins, group1Start, group1End, group2Start, group2End);

        if (comparison < 0) {
            return findLighterCoin(coins, group1Start, group1End);
        } else if (comparison > 0) {
            return findLighterCoin(coins, group2Start, group2End);
        } else {
            return findLighterCoin(coins, group3Start, end);
        }
    }

    private static int compareGroups(int[] coins, int group1Start, int group1End, int group2Start, int group2End) {
        int group1Sum = 0;
        int group2Sum = 0;

        for (int i = group1Start; i <= group1End; i++) {
            group1Sum += coins[i];
        }

        for (int i = group2Start; i <= group2End; i++) {
            group2Sum += coins[i];
        }

        return Integer.compare(group1Sum, group2Sum);
    }
}

