package DSA;

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


public class BearAndSteadyGene {

    /*
     * Complete the 'steadyGene' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING gene as parameter.
     */

    public static int steadyGene(String gene) {
        // Write your code here

        Map<Character, Integer> characterFrequencyMap = new HashMap<>();
        for (int i = 0; i < gene.length(); i++) {
            char character = gene.charAt(i);
            int frequency = characterFrequencyMap.getOrDefault(character, 0);
            characterFrequencyMap.put(character, ++frequency);
        }

        System.out.println(characterFrequencyMap);

        return 0;

    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String gene = bufferedReader.readLine();

        int result = BearAndSteadyGene.steadyGene(gene);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}



