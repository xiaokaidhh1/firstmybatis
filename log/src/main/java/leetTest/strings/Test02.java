package leetTest.strings;

import org.junit.jupiter.api.Test;

public class Test02 {
    @Test
    public static int reverse(int x) {
        int res = 0;
        while(x!=0){
            int  t=x%10;
           res=res*10+t;
            x=x/10;
        }
        return (int) res == res ? (int) res : 0;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
