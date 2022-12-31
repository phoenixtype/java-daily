package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Check {

    public static boolean balanced(int N, Map<Character, Integer> map) {
        if (map.get('A') <= N && map.get('C') <= N && map.get('G') <= N
                && map.get('T') <= N)
            return true;
        return false;
    }

    public static int Solve(String gene) {
        int N = gene.length() / 4;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('A', 0);
        map.put('C', 0);
        map.put('G', 0);
        map.put('T', 0);

        for (int i = 0; i < gene.length(); ++i) {
            map.put(gene.charAt(i), map.get(gene.charAt(i)) + 1);
        }

        int min = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        while (i < gene.length() && j < gene.length()) {
            if (!balanced(N, map)) {
                map.put(gene.charAt(j), map.get(gene.charAt(j)) - 1);
                //System.out.println(map);
                j++;
            } else {
                min = Math.min(min, j - i);
                map.put(gene.charAt(i), map.get(gene.charAt(i)) + 1);
                //System.out.println(map);
                i++;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String gene = in.next();
        in.close();
        System.out.println(Solve(gene));
    }
}


