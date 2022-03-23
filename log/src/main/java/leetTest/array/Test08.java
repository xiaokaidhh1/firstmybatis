package leetTest.array;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Test08 {
    //非0的往前移
    @Test
    public static void moveZeroes(int[] nums) {
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[t++] = nums[i];
            }
        }
        for (int i = t; i < nums.length; i++) {
            nums[i] = 0;
        }
        for (int num : nums) {
            System.out.println(num);
        }

    }

    @Test
    public static void moveZeroes2(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
            }
        }
    }


    public static void main(String[] args) {
        int nums[] = {1, 24, 0, 20, 0, 3};
        moveZeroes2(nums);
    }
}