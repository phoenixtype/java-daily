package ProblemSolving;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class ResultPickingNumbers {

    public static int pickingNumbers(List<Integer> a) {

        /**
         * The method first initializes a hashmap freqMap to count the frequency of each integer in the input list a.
         * This is done using a for-each loop to iterate over the list and add each integer to the hashmap, incrementing its frequency count as necessary.
         */

        // Initialize a hashmap to count the frequency of each integer in the list
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        /**
         * The method then iterates through the hashmap to find the maximum length of a sub-list that meets the given conditions.
         * For each key in the hashmap, it calculates the length of the current sub-list (i.e., the frequency count of the current integer),
         * as well as the lengths of the sub-lists containing the previous and next integers (if any).
         * It then calculates the maximum possible length of a sub-list containing the current integer
         * by adding the length of the current sub-list to the length of the longer of the two adjacent sub-lists (if any).
         * If this maximum sub-list length is greater than the current maximum, the method updates the maximum accordingly.
         */

        // Iterate through the hashmap to find the maximum length of a sub-list that meets the conditions
        int maxSublistLength = 0;
        for (int num : freqMap.keySet()) {
            int currLength = freqMap.get(num);
            int prevLength = freqMap.getOrDefault(num - 1, 0);
            int nextLength = freqMap.getOrDefault(num + 1, 0);
            int subListLength = Math.max(currLength + prevLength, currLength + nextLength);
            maxSublistLength = Math.max(maxSublistLength, subListLength);
        }
        return maxSublistLength;
    }
}

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = ResultPickingNumbers.pickingNumbers(a);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}