package Excpetions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        while(true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Please enter a value between 0 and 9");
            }
        }
    }

    private static int getIntEAFP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    private static int getIntLBYL() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer");
        String input = scanner.next();

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x/y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x/y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    private static int divide() {
        int x, y;
        try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x/y;
        } catch (NoSuchElementException e) {
            throw new ArithmeticException("No suitable input");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("attempt to divide by zero");
        }

    }
}
