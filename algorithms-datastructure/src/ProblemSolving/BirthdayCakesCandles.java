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



public class BirthdayCakesCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
        long frequency = candles.stream().filter(v -> v == max).count();
        return frequency == 0 ? 0 : (int) frequency;
    }
}

class BirthdayCakesCandlesSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println();
        System.out.println("Total number of candles: " + candlesCount);

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = BirthdayCakesCandles.birthdayCakeCandles(candles);
        System.out.println("Number of tallest candles: " + result);

        bufferedReader.close();
    }
}

