package src.leetcode.leetcode75studyplan;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        if(nums.length == 0) return - 1;
        int leftSum = 0, rightSum = 0;
//        get the total sum
        for(int num : nums){
            rightSum += num;
        }

        for(int i = 0; i < nums.length; i ++) {
//            compare each left index with right side
            rightSum -= nums[i];
            if(rightSum == leftSum) {return i;}
            leftSum += nums[i];
        }
        return - 1;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,-1};
        System.out.println(pivotIndex(arr));
    }
}
