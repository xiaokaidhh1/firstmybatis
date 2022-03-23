package leetTest.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复元素
 */
public class Test04 {
    public static boolean hh(int[] nums){
        Set<Integer> s= new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if (!s.add(nums[i])) {
                    return true;
                }
            }
        return false;
        }
    public static void main(String[] args) {
        int nums[] = {1, 2, 4,5,6,3,12,1};
        System.out.println(hh(nums));
    }

}
