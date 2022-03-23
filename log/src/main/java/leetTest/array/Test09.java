package leetTest.array;


import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class Test09 {
    @Test
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            }
            else {
                return new int[]{map.get(target - nums[i]), i};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 7, 5,6};
        for (int i : twoSum(nums, 9)) {
            System.out.println(i);
        }
    }

}
