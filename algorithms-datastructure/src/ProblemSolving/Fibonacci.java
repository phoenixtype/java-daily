package ProblemSolving;


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        calculateFibonacciRecursive(n);
        calculateFibonacciOptimized(n);
        scanner.close();
    }

    private static int calculateFibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacciRecursive(n-1) + calculateFibonacciRecursive(n-2);
        }
    }

    private static void calculateFibonacciOptimized(int n) {
        if (n <= 1) {
            return;
        }

        int fibonacci = 0;
        int fibonacciMinusTwo = 0;
        int fibonacciMinusOne = 0;

        for (int i = 2; i <= n ; i++) {
            fibonacci = fibonacciMinusOne + fibonacciMinusTwo;
            fibonacciMinusTwo = fibonacciMinusOne;
            fibonacciMinusOne = fibonacci;
        }
        System.out.println(fibonacci);
    }
}
