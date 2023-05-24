package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZero {
    public static void moveZeros(List<Integer> numbers) {
        int i = 0; //pointer for iterating through the list
        int j = 0; //pointer for placing non-zero elements correctly

        while (i < numbers.size()) {
            if (numbers.get(i) != 0) {
                numbers.set(j, numbers.get(i));
                j++;
            }
            i++;
        }
        while (j < numbers.size()) {
            numbers.set(j, 0);
            j++;
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 0, 3, 0, 0, 2);

        System.out.println("Before: " + numbers);
        moveZeros(numbers);
        System.out.println("Before: " + numbers);

    }
}
