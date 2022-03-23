package leetTest.array;


//
public  class Test01{
    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 2,2,2,2,2,2,2, 3, 3, 3, 4, 5};
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
}
    }
}