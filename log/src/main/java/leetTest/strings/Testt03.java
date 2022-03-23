package leetTest.strings;

import org.junit.jupiter.api.Test;

public class Testt03 {
    @Test
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int j=i+1;
           while (j<s.length()){
                if (!(s.charAt(i)==s.charAt(j))) {
                    j++;
                }
                else break;
            }
            return i;
        }
        return -1;
    }
    @Test
    public void ceshi(){
        String s = "hello";
        System.out.println();

    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("hehehelloew"));
    }
}
