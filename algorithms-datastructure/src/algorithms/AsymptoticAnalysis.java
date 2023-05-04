package algorithms;

// Time complexity = O(n^2)
public class AsymptoticAnalysis {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        float pie = 3.14f;

        for (int i = 1; i < n; i += 3) {
            System.out.println(pie);
            for (int j = 1; j < n; j += 2) {
                sum += 1;
                System.out.println(sum);
            }
        }
    }
}
