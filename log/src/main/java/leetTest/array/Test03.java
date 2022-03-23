package leetTest.array;

public class Test03 {
    public static void reverse(int nums[],int start, int end){
        while (start<end){
        int t=nums[start];
        nums[start++]=nums[end];
        nums[end--]=t;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k=3;
       reverse(nums,0,nums.length-1);
       reverse(nums,0,k-1);
       reverse(nums,k,nums.length-1);
       for(int i=0;i<nums.length;i++){
           System.out.println(nums[i]);
       }
    }


}