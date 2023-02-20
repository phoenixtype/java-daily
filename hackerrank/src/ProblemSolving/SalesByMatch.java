package ProblemSolving;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class ResultSalesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    // ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        HashMap<Integer, Integer> sockMatch = new HashMap<>();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!sockMatch.containsKey(ar.get(i))) {
                sockMatch.put(ar.get(i), 1);
            } else {
                if (sockMatch.get(ar.get(i)) < 2) {
                    sockMatch.put(ar.get(i), sockMatch.get(ar.get(i)) + 1);
                    if (sockMatch.get(ar.get(i)) == 2) {
                        count++;
                        sockMatch.put(ar.get(i), 0);
                    }
                }
            }
        }
        return count;
    }
}

public class SalesByMatch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "")
                .split(" ")).map(Integer::parseInt).collect(toList());

        int result = ResultSalesByMatch.sockMerchant(n, ar);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}