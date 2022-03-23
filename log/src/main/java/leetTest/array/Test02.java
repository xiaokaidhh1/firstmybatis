package leetTest.array;
//贪心
public class Test02 {
    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 3, 6, 4};
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]>0)
            sum = sum + nums[i + 1] - nums[i];
        }
        System.out.println(sum);

    }

}
