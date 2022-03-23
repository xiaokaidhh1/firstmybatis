package leetTest.array;

public class Test07 {

    public static int[] plusOne(int[] digits) {
        for (int i=digits.length-1; i>=0; i--) {
           if(digits[i]!=9){
               digits[i] += 1;
               return digits;
           }
           else{
               digits[i] = 0;
           }
    }
        int t[] = new int[digits.length + 1];
        t[0] = 1;
        return t;

    }

    public static void main(String[] args) {
        int digits[] = {9, 9, 9};
        for (int i : plusOne(digits)) {
            System.out.println(i);
        }
    }
}
