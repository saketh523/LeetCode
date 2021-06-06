class Solution {
    public int minOperations(int[] nums) {
        int count = 0, res = 0;

        for(int i=0; i<nums.length-1;i++){
            if(nums[i] >= nums[i+1]){
            count = nums[i] - nums[i+1] + 1;
            res += count;
            nums[i+1] = nums[i+1] + count;
            }
        }
       
        return res;    
    }
}
