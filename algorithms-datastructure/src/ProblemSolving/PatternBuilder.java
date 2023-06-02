package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class PatternBuilder {
    public static List<String> buildPattern(List<List<Character>> inputList) {
        List<String> builder = new ArrayList<>();
        int list1 = inputList.get(0).size();
        int list2 = inputList.get(1).size();
        int list3 = inputList.get(2).size();

        for (int i = 0; i < list1; i++) {
            for (int j = 0; j < list2; j++) {
                for (int k = 0; k < list3; k++) {
                    String pattern = String.valueOf(inputList.get(0).get(i) + inputList.get(1).get(j) + inputList.get(2).get(k));
                    builder.add(pattern);
                }
            }
        }
        return builder;
    }

    public static List<String> buildStreamPatterns(List<List<Character>> inputLists) {
        return inputLists.get(0).stream()
                .flatMap(a -> inputLists.get(1).stream()
                        .flatMap(b -> inputLists.get(2).stream()
                                .map(c -> String.valueOf(a) + String.valueOf(b) +String.valueOf(c)))).toList();
    }

    public static void main(String[] args) {
        List<List<Character>> inputLists = new ArrayList<>();
        inputLists.add(List.of('a', 'b'));
        inputLists.add(List.of('+', '-'));
        inputLists.add(List.of('0', '1', '2', '3', 'x', 'y'));

        List<String> patterns = buildPattern(inputLists);
        List<String> patterns1 = buildStreamPatterns(inputLists);
        System.out.println(patterns);

        System.out.println(patterns1);
    }
}
