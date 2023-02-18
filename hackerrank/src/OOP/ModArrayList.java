package OOP;

import java.util.ArrayList;

public class ModArrayList<D> extends ArrayList<D> {

    public D getUsingIndex(int index) {
        int validIndex = Math.abs(index) % this.size();
        return this.get(validIndex);
    }

}
