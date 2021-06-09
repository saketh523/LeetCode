class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        int count = 0;
        int prev = nums[0];
        
        
        for(int i = 1; i< nums.length; i++){
            if(nums[i] != prev){
                count++;
                nums[count] = nums[i];
                prev = nums[i];
                
            }
           
        }
        return count+1;
            
    }
}
