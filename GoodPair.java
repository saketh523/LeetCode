class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        /*
        
        if(nums[i] == nums[j] and i<j)
            good pair
            
        return num;
          
           
        */
        int count = 0;
        int i = 0, j = 1;
        int len = nums.length;
        for(; i<len; i++){
             j = 1;
            for(; j< len;j++){                
                if(nums[i] == nums[j] && i<j){
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
