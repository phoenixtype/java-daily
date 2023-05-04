package DSA;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'highestValuePalindrome' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER n
     *  3. INTEGER k
     */

    public static String highestValuePalindrome(String s, int n, int k) {
        char palin[] = s.toCharArray();
        String ans = "";

        // Initialize l and r by leftmost and
        // rightmost ends
        int l = 0;
        int r = s.length() - 1;

        // First try to make String palindrome
        while (l < r) {

            // Replace left and right character by
            // maximum of both
            if (s.charAt(l) != s.charAt(r)) {
                palin[l] = palin[r] = (char)Math.max(
                        s.charAt(l), s.charAt(r));
                k--;
            }
            l++;
            r--;
        }

        // If k is negative then we can't make
        // String palindrome
        if (k < 0) {
            return "-1";
        }

        l = 0;
        r = s.length() - 1;

        while (l <= r) {

            // At mid-character, if K>0 then change
            // it to 9
            if (l == r) {
                if (k > 0) {
                    palin[l] = '9';
                }
            }

            // If character at lth (same as rth) is
            // less than 9
            if (palin[l] < '9') {

		/* If none of them is changed in the
			previous loop then subtract 2 from K
			and convert both to 9 */
                if (k >= 2 && palin[l] == s.charAt(l)
                        && palin[r] == s.charAt(r)) {
                    k -= 2;
                    palin[l] = palin[r] = '9';
                }

		/* If one of them is changed in the
		previous loop then subtract
		1 from K (1 more
		is subtracted already) and make them 9 */
                else if (k >= 1
                        && (palin[l] != s.charAt(l)
                        || palin[r]
                        != s.charAt(r))) {
                    k--;
                    palin[l] = palin[r] = '9';
                }
            }
            l++;
            r--;
        }
        for (int i = 0; i < palin.length; i++)
            ans += palin[i];
        return ans;
    }
}

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String s = bufferedReader.readLine();

        String result = Result.highestValuePalindrome(s, n, k);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}






