package DSA;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/*
 -
 */

class ResultInsertionSort {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        for (int i = 1; i < n; i++) {
            int current = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > current) {

                // Replaces the element at the specified position in this list with the specified element (optional operation).
                // index – index of the element to replace
                // element – element to be stored at the specified position
                arr.set(j +1, arr.get(j));
                j--;
            }

            arr.set(j + 1, current);

            for (int k = 0; k < arr.size(); k++) {
                System.out.print(arr.get(k));
                if (k < arr.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class InsertionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        ResultInsertionSort.insertionSort2(n, arr);

        bufferedReader.close();
    }
}

