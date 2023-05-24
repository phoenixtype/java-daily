package algorithms;


/**
 * QUESTION
 *
 * Dynamic programming algorithms: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time.
 * Implement a function to count the number of possible ways that the child can run up the stairs.
 *
 Time complexity: O(n), since we iterate n times in the loop to fill in the memo array.
 Space complexity: O(n), since we use an array of size n+1 to store the intermediate results.
 */
public class DynamicProgramming {
    public static int countWaysToClimb(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            int[] memo = new int[n + 1];
            memo[0] = 1;
            memo[1] = 1;
            memo[2] = 2;
            for (int i = 3; i <= n; i++) {
                memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];
            }
            return memo[n];
        }
    }
}
