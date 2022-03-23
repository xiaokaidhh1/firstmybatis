package leetTest.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test06 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> m = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        for (int i1 : nums2) {
            if (m.getOrDefault(i1,0) > 0) {
                list.add(i1);
                m.put(i1, m.get(i1) - 1);
            }
        }
        int str[] = new int[list.size()];
        int i = 0;
        for (Integer o : list) {
            str[i++] = o;
        }
        return str;
    }
    public static void main(String[] args) {
        int nums1[] = {1, 2, 4,4,4,5,5,2,7,7,7,5};
        int nums2[] = {1, 2,4,5,5,5,5,5, 6, 6, 7,7};
        for (int i : intersect(nums1, nums2)) {
            System.out.println(i);
        }
    }



}
