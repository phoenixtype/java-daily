package OOP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tree myTree = new Tree(25.0, 5.0, TreeType.OAK);
        System.out.println(TreeType.OAK);
        System.out.println(myTree.getTreeHeightFt());
        System.out.println(myTree.getTruckDiameterInches());

        ModArrayList<Integer> listy = new ModArrayList<>();
        listy.add(0);
        listy.add(20);
        listy.add(40);
        listy.add(30);

        System.out.println(listy.getUsingIndex(0));
        System.out.println(listy.getUsingIndex(40));
        System.out.println(listy.getUsingIndex(-2));
        System.out.println(listy.getUsingIndex(4));
    }
}
