class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] res = new int[nums.length];
        int count = 0, i=0, j=0;
        
        for(; i<nums.length; i++){
              j=0;
            for(; j<nums.length;j++){
                      if((nums[j] < nums[i]) && (j != i)){
                          count++;
        
        }
            }
            res[i] = count;
            count = 0;
        }
        
        return res;
        
    }
}
