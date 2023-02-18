package ProblemSolving;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class ResultMigratoryBirds {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */


    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        HashMap<Integer, Integer> frequencyHashMap = new HashMap<>();

        for (int element : arr) {
            if (!frequencyHashMap.containsKey(element)) {
                frequencyHashMap.put(element, 1);
            } else {
                frequencyHashMap.put(element, frequencyHashMap.get(element) + 1);
            }
        }

        Iterator frequencyHashMapIterator = frequencyHashMap.entrySet().iterator();
        int maximumValue = 0;
        int minMaxValue = 0;

        while (frequencyHashMapIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)frequencyHashMapIterator.next();
            int mapElementActualValue = ((int)mapElement.getValue());
            int mapElementKeyValue = ((int)mapElement.getKey());

            if (mapElementActualValue > maximumValue) {
                maximumValue = mapElementActualValue;
                minMaxValue = mapElementKeyValue;
            }
        }
        return minMaxValue;
    }
}

public class MigratoryBirds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = ResultMigratoryBirds.migratoryBirds(arr);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
