package ProblemSolving;

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

class ResultDrawingBook {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

/*
    public static int pageCount(int n, int p) {
        // Write your code here
        int minimumCount = 0;
        int leftToRightCount = 0;
        int rightToLeftCount = 0;

        if (p == n || n == 1 || p == 1) {
            return 0;
        }

        if (n - p == 1 || n - p == 2) {
            if (n % 2 != 0) {
                return 0;
            }
            return 1;

        }

        if (p % 2 == 0) {
            leftToRightCount = p/2;
        } else {
            leftToRightCount = (p - 1)/2;
        }

        if (p % 2 ==0) {
            if (n % 2 == 0) {
                rightToLeftCount = (n - p)/2;
            }
            if (n % 2 != 0) {
                rightToLeftCount = ((n - p) - 1)/2;
            }
        } else {
            rightToLeftCount = (n - p)/2;
        }
        return minimumCount = Math.min(leftToRightCount, rightToLeftCount);
    }

 */

    public static int pageCount(int n, int p) {
        return Math.min(p/2, (n-p)/2);
    }
}

public class DrawingBook {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = ResultDrawingBook.pageCount(n, p);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}