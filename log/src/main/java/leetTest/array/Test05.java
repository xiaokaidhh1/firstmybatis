package leetTest.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 只出现一次的数字
 */
public class Test05 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> s = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(!s.containsKey(nums[i])) {
                s.put(nums[i],1);
            }
            else{
                s.replace(nums[i],2);
            }
            }
            for(Integer i:s.keySet()){
            if(s.get(i)==1){
                return i;
            }
        }
        return 0;
    }
    public static int single2(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                //如果添加失败，说明这个值
                //在集合Set中存在，我们要
                //把他给移除掉
                set.remove(num);
            }
        }
        //最终集合Set中只有一个元素，我们直接返回
        return (int) set.toArray()[0];
    }
    //异或运算
    public static int single3(int[] nums){
        int t=0;
        for(int num:nums){
            t=t^num;
        }
        return t;
    }
    public static void main(String[] args) {
        int nums[] = {1,1, 2,2, 3, 3, 4, 4, 5, 5,6};
        System.out.println(single2(nums));
        System.out.println(single3(nums));
    }
}
