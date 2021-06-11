class Solution {
    public int arraySign(int[] nums) {
        
        int res = 1;
        
        for(int i=0; i<=nums.length-1;i++){
            
            if(nums[i] == 0){
                return 0;
            }
            else if(nums[i] < 0){
                nums[i] = -1;
            }
            else if(nums[i] > 0){
                nums[i] = 1;
            }
            res = res * nums[i];
        }
        
        
        if (res > 0){
            res = 1;
        }
        else if(res < 0){
            res = -1;
        }
        return res;
    }
}
