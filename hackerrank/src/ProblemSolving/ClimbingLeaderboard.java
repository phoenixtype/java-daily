package ProblemSolving;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultClimbingLeaderboard {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */


    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<Integer>();

        //"Remove repeated numbers"
        Set<Integer> hashSet = new HashSet<Integer>(ranked);
        ranked.clear();
        ranked.addAll(hashSet);

        //"Sort from highest to lowest"
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(ranked, comparador);

        for (Integer valuePlayer : player) {
            int start = 0;
            int end = ranked.size() - 1;
            int medium = (start + end) / 2;
            int i = 0;

            //"Binary search"
            while (start <= end && ranked.get(medium) != valuePlayer) {
                if (valuePlayer < ranked.get(medium)) {
                    start = medium + 1;
                    i = start;
                } else {
                    end = medium - 1;
                    i = end;
                }
                medium = (start + end) / 2;
            }
            if (medium == ranked.size()) {
                result.add(medium + 1);
            } else if (i < 0) {
                result.add(1);
            } else {
                if (valuePlayer == ranked.get(medium)) {
                    result.add(medium + 1);
                }
                else {
                    result.add(medium + 2);
                }
            }
        }
        return result;
    }
}

public class ClimbingLeaderboard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(playerCount);

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = ResultClimbingLeaderboard.climbingLeaderboard(ranked, player);
        System.out.println(result);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}