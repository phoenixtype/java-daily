import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        int[] sumIndex = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    sumIndex[0] = i;
                    sumIndex[1] = j;
                    return sumIndex;
                }
            }
        }
        return sumIndex;
    }
}
