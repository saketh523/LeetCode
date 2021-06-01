package com.company.leetcode;

public class Shuffle {
        public int[] shuffle(int[] nums, int n) {
        /*
        put at even and odd positions.
      */
            int[] arr = new int [2*n];
            int j = 0;
            int val = n;
            for(int i = 0;i<n;i++){
                arr[j++] = nums[i];
                arr[j++] = nums[val++];

            }
            return arr;

        }
    }
