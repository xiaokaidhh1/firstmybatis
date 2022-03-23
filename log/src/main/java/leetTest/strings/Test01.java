package leetTest.strings;

import org.junit.jupiter.api.Test;

/**
 * 反转字符串
 */
public class Test01 {
    @Test
    public static void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        for (int i = 0; i < s.length/2; i++) {
            if(left<right) {
                char t = s[left];
                s[left++] = s[right];
                s[right--] = t;
            }

        }
    }


    public static void main(String[] args) {
        char[] s = {'h', 'e','l','l','o'};
        reverseString(s);
        System.out.println(s);

    }
}
