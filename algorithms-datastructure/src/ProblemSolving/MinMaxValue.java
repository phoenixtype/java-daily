package ProblemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * <br>Concise and Readable Code: The Stream API offers a fluent and declarative programming style. It allows you to express complex data processing operations in a concise and readable manner, making the code easier to understand and maintain.
 * <br>
 * <br>Functional Programming Paradigm: The Stream API embraces functional programming principles. It encourages immutability, avoids side effects, and promotes the use of lambda expressions and functional interfaces. This approach leads to more modular and composable code, enhancing code reusability and testability.
 * <br>
 * <br>Stream Pipelines: Stream operations can be combined into pipelines, where the output of one operation becomes the input for the next. This enables a series of transformations to be applied sequentially on the data. Stream pipelines can be optimized internally by the Stream API to perform operations more efficiently.
 * <br>
 * <br>Lazy Evaluation: Streams support lazy evaluation. It means that the elements of a stream are processed on-demand as they are needed, rather than computing the entire stream at once. This can save computational resources when dealing with large data sets or when only a subset of the data is required.
 * <br>
 * <br>Parallelism and Performance: The Stream API can seamlessly leverage parallel processing to improve performance on multi-core systems. By using parallel streams, the Stream API can automatically distribute the workload across multiple threads, potentially speeding up data processing tasks.
 * <br>
 * <br>Built-in Operations: The Stream API provides a rich set of built-in operations, including filtering, mapping, reducing, sorting, aggregating, and more. These operations simplify common data processing tasks, making it easier to express complex data transformations in a compact and efficient manner.
 * <br>
 * <br>Interoperability: The Stream API integrates well with other parts of the Java ecosystem. It can seamlessly work with existing Java collections, lambda expressions, method references, and functional interfaces. This interoperability allows for smooth integration of stream-based code into existing codebases.
 * <br>
 * <br>Easy Integration with Functional Interfaces: The Stream API integrates smoothly with functional interfaces, such as Predicate, Function, and Consumer. This makes it easy to use lambda expressions and method references to define custom behavior for filtering, mapping, and processing elements in the stream.
 */
public class MinMaxValue {
    public static void miniMaxSum(List<Integer> arr) {

        // Write your code here
        long minSum = arr.stream().sorted().limit(4).mapToLong(Integer::longValue).sum();
        long maxSum = arr.stream().sorted().skip(1).mapToLong(Integer::longValue).sum();

        System.out.println(minSum + " " + maxSum);

        long minSum1 = 0;
        long maxSum1 = 0;
        long sum = 0;
        long min = arr.get(0);
        long max = arr.get(0);
        for (Integer integer : arr) {
            sum += integer;
            if (integer < min) {
                min = integer;
            }
            if (integer > max) {
                max = integer;
            }
        }
        minSum1 = sum - max;
        maxSum1 = sum - min;
        System.out.println(minSum1 + " " + maxSum1);

    }
}

class MinMaxValueSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }
        MinMaxValue.miniMaxSum(arr);
        bufferedReader.close();
    }
}

