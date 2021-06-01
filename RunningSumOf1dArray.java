package com.company.leetcode;

public class RunningSumOf1dArray {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4};

        runningSum(nums);

    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        if(nums.length <= 1) return nums;
        for(int i = 1; i < nums.length ; i++) {
            nums[i] = nums[i] + nums[i-1];
        }

        return nums;
    }

}
