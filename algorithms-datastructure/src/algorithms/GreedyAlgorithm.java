package algorithms;


/**
 * QUESTION
 *
 * Greedy algorithms: Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents),
 * and pennies (1 cent), implement a function to calculate the number of COINS to represent V cents.
 *
 Time complexity: O(1), since the input size (the value of V) does not affect the number of iterations in the loop.
 Space complexity: O(1).
 */
public class GreedyAlgorithm {
    public static int calculateCoins(int V) {
        int[] denominations = {25, 10, 5, 1};
        int[] counts = new int[4];
        int coins = 0;
        for (int i = 0; i < 4; i++) {
            counts[i] = V / denominations[i];
            coins += counts[i];
            V = V % denominations[i];
        }
        return coins;
    }
}
