package DSA;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultBigSorting {

    /*
     * Complete the 'bigSorting' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY unsorted as parameter.
     */

    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here

        // Sorts the specified list according to the order induced by the specified comparator
        Collections.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() > b.length()) {
                    return 1;
                } else if (a.length() < b.length()) {
                    return -1;
                } else {
                    BigInteger b1 = new BigInteger(a);
                    BigInteger b2 = new BigInteger(b);
                    return b1.compareTo(b2);
                }
            }
        });
        return unsorted;

    }

//    public static List<String> bigSorting(List<String> unsorted) {
//
//        return unsorted
//                .stream()
//                .map(BigInteger::new)
//                .sorted()
//                .map(String::valueOf)
//                .collect(Collectors.toList());
//    }

}

public class BigSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = ResultBigSorting.bigSorting(unsorted);
        System.out.println(result);

//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}