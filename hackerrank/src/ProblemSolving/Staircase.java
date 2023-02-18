package ProblemSolving;


import java.io.*;

class ResultStaircase {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here

        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "#".repeat(i));
        }
    }
}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        ResultStaircase.staircase(n);

        bufferedReader.close();
    }
}
