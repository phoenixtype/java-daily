package DSA;

public class BubbleSortAlgorithm {

    public static void main(String[] args) {

        int[] numbers = {22, -15, 35, 2, 55, 7};

        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, i +1);
                }

            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }

    private static void swap(int[] intArray, int i, int j) {
        int temp;

        temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }


}
