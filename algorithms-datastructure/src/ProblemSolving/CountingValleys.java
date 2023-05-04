package ProblemSolving;

import java.io.*;

class ResultCountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleys = 0;
        int level = 0;
        boolean isBelowSeaLevel = false;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U') {
                level++;
            }
            if (path.charAt(i) == 'D') {
                level--;
            }
            if (level < 0) {
                isBelowSeaLevel = true;
            }
            if (isBelowSeaLevel && level == 0) {
                isBelowSeaLevel = false;
                valleys++;
            }
        }
        return  valleys;
    }
}

public class CountingValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = ResultCountingValleys.countingValleys(steps, path);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}