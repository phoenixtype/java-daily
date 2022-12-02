package OOP;

import java.util.ArrayList;

public class OddArrayList extends ArrayList<Integer> {

//    @Override
    public void add(int index, int element){
        if (isOdd(element)) {
            super.add(index, element);
        }
    }

    public static boolean isOdd(Integer element) {
        return Math.abs(element) % 2 == 1;
    }
}
