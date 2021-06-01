package com.company.leetcode;

public class RunningSum {
        public int[] runningSum(int[] nums) {

        /*
        [1,3,5,7,9]

        [1,4,9,16,25]

        runningSum[i] = sum(nums[0]+ nums[1]+ ...+ nums[i])


        */

            int i = 1;
            if(nums.length<=1){
                return nums;
            }
            for(;i<nums.length;i++){
                nums[i] = nums[i]+nums[i-1];
            }
            return nums;
        }
    }
