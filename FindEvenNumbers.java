class Solution {
    public int findNumbers(int[] nums) {    
    int temp = 0;
    int count = 0;
    int res = 0;
    for(int i=0; i< nums.length;i++){
        temp = nums[i];
        while(temp>0) {
            temp = temp / 10;
            count++;
        }
        if(count%2 == 0 ){
            res++;
        }
        count = 0;
    }
    return res;        
    }
}
