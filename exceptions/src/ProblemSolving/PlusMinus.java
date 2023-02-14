package ProblemSolving;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class ResultPlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double lessThanZero = 0;
        double equalsZero = 0;
        double greaterThanZero = 0;


        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                lessThanZero++;
            }
            if (arr.get(i) == 0) {
                equalsZero++;
            }
            if (arr.get(i) > 0) {
                greaterThanZero++;
            }
        }
        System.out.printf("%.6f", greaterThanZero / arr.size());
        System.out.println();
        System.out.printf("%.6f", lessThanZero / arr.size());
        System.out.println();
        System.out.printf("%.6f", equalsZero / arr.size());
    }
}


public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        ResultPlusMinus.plusMinus(arr);

        bufferedReader.close();
    }
}
