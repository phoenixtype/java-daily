package DSA;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultMissingNumbers {

    /*
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */


    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> crr = new ArrayList<>();

        for(int i = 0; i < brr.size(); i++){
            if(arr.contains(brr.get(i))){
                arr.remove(brr.get(i));
            }
            else {
                if(!crr.contains(brr.get(i)))
                    crr.add(brr.get(i));
            }
        }
        crr.sort(null);
        return crr;
    }

}

public class MissingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = ResultMissingNumbers.missingNumbers(arr, brr);
        System.out.println(result);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

