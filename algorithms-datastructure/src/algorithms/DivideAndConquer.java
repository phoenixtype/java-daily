package algorithms;


/**
 * QUESTION
 *
 * Divide and conquer algorithms: Given a 2D array of k rows and 4 sorted columns and an empty 1D output array of size k∗n,
 * copy all the elements from k sorted arrays to the k∗n output array using a divide and conquer approach.
 *
 Time complexity: O(kn log k), where k is the number of rows in the 2D array and n is the number of columns.
 This is because we need to sort each row (which takes O(n log n) time) and then merge all the sorted rows (which takes O(kn log k) time using a divide and conquer approach).
 Space complexity: O(kn), since we need to store the output array of size k*n and temporary arrays of size kn during the merging process.
 */
public class DivideAndConquer {
    public static void copyArrays(int[][] sortedArrays, int[] outputArray, int left, int right) {
        if (left == right) {
            for (int i = 0; i < sortedArrays[left].length; i++) {
                outputArray[i + left * sortedArrays[left].length] = sortedArrays[left][i];
            }
        } else if (left + 1 == right) {
            mergeArrays(sortedArrays[left], sortedArrays[right], outputArray, left);
        } else {
            int mid = left + (right - left) / 2;
            copyArrays(sortedArrays, outputArray, left, mid);
            copyArrays(sortedArrays, outputArray, mid + 1, right);
            mergeArrays(outputArray, left, mid, mid + 1, right);
        }
    }

    public static void mergeArrays(int[] a, int[] b, int[] c, int row) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k + row * a.length] = a[i];
                i++;
            } else {
                c[k + row * a.length] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            c[k + row * a.length] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k + row * a.length] = b[j];
            j++;
            k++;
        }
    }

    public static void mergeArrays(int[] a, int left1, int right1, int left2, int right2) {
        int[] temp = new int[a.length];
        int i = left1, j = left2, k = 0;
        while (i <= right1 && j <= right2) {
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }
        while (i <= right1) {
            temp[k] = a[i];
            i++;
            k++;
        }
        while (j <= right2) {
            temp[k] = a[j];
            j++;
            k++;
        }
        for (i = 0; i < k; i++) {
            a[i + left1] = temp[i];
        }
    }

    public static void mergeSort(int[][] sortedArrays, int[] outputArray) {
        copyArrays(sortedArrays, outputArray, 0, sortedArrays.length - 1);
    }
}
