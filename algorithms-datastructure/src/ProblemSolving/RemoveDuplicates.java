package ProblemSolving;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        duplicatesStreamAPI();
        duplicatesSet();
    }

    //Using the Java Streams API
    public static void duplicatesStreamAPI() {
        List<Integer> originalList = Arrays.asList(1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8);
        List<Integer> duplcatesRemovedList = originalList.stream().distinct().toList();
        System.out.println(duplcatesRemovedList);
    }

    //Using Set Interface
    public static void duplicatesSet() {
        List<Integer> originalList = Arrays.asList(1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8);
        Set<Integer> duplicateRemoverList = new HashSet<>(originalList);
        List<Integer> uniqueList = new ArrayList<>(duplicateRemoverList);
        System.out.println(uniqueList);
    }
}
